package com.wad.firstmvc.controllers;

import com.wad.firstmvc.services.OrderData;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    private final OrderData orderData;

    public OrderController(OrderData orderData) {
        this.orderData = orderData;
    }

    @GetMapping("/orders")
    public String viewOrders(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        model.addAttribute("orders", orderData.findByUsername(username));
        return "orders";
    }
}