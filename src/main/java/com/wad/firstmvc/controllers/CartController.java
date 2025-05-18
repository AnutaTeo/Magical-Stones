package com.wad.firstmvc.controllers;

import com.wad.firstmvc.domain.CartItem;
import com.wad.firstmvc.domain.Crystal;
import com.wad.firstmvc.services.CrystalData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("cart")
public class CartController {

    private final CrystalData data;

    public CartController(CrystalData data) {
        this.data = data;
    }

    @ModelAttribute("cart")
    public List<CartItem> cart() {
        return new ArrayList<>();
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam Long id, @ModelAttribute("cart") List<CartItem> cart) {
        Crystal crystal = data.findById(id).orElse(null);
        if (crystal == null) return "redirect:/shop";

        for (CartItem item : cart) {
            if (item.getProduct().getId().equals(id)) {
                item.setQuantity(item.getQuantity() + 1);
                return "redirect:/cart";
            }
        }

        cart.add(new CartItem(crystal, 1));
        return "redirect:/cart";
    }

    @PostMapping("/cart/update")
    public String updateCart(@RequestParam Long id, @RequestParam int quantity,
                             @ModelAttribute("cart") List<CartItem> cart) {
        cart.removeIf(item -> {
            if (item.getProduct().getId().equals(id)) {
                if (quantity <= 0) return true;
                item.setQuantity(quantity);
            }
            return false;
        });
        return "redirect:/cart";
    }

    @GetMapping("/cart")
    public String viewCart(Model model, @ModelAttribute("cart") List<CartItem> cart) {
        double total = cart.stream().mapToDouble(CartItem::getSubtotal).sum();
        model.addAttribute("total", total);
        return "cart";
    }
}