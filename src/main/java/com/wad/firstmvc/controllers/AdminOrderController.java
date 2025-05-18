package com.wad.firstmvc.controllers;

import com.wad.firstmvc.services.OrderData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/orders")
public class AdminOrderController {

    private final OrderData orderData;

    public AdminOrderController(OrderData orderData) {
        this.orderData = orderData;
    }

    @GetMapping
    public String adminOrderPanel(Model model) {
        model.addAttribute("orders", orderData.getAll());
        return "admin_orders";
    }

    @PostMapping("/update")
    public String updateStatus(@RequestParam Long id, @RequestParam String status) {
        orderData.updateStatus(id, status);
        return "redirect:/admin/orders";
    }
}