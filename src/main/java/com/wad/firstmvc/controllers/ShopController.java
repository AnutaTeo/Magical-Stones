package com.wad.firstmvc.controllers;

import com.wad.firstmvc.services.CrystalData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    private final CrystalData data;

    public ShopController(CrystalData data) {
        this.data = data;
    }

    @GetMapping("/shop")
    public String shopPage(Model model) {
        model.addAttribute("crystals", data.findAll());
        return "shop";
    }
}