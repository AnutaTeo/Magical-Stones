package com.wad.firstmvc.controllers;

import com.wad.firstmvc.domain.Crystal;
import com.wad.firstmvc.services.CrystalData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShopController {
    private final CrystalData data;

    public ShopController(CrystalData data) {
        this.data = data;
    }

    @GetMapping("/shop")
    public String shop(@RequestParam(required = false) String color, Model model) {
        List<Crystal> crystals = data.findAll();

        if (color != null && !color.isEmpty()) {
            crystals = crystals.stream()
                    .filter(c -> c.getColor().equalsIgnoreCase(color))
                    .toList();
        }

        model.addAttribute("crystals", crystals);
        return "shop";
    }
}