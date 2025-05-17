package com.wad.firstmvc.controllers;


import com.wad.firstmvc.domain.Crystal;
import com.wad.firstmvc.services.CrystalData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ProductController {
    private final CrystalData data;

    public ProductController(CrystalData data) {
        this.data = data;
    }

    @GetMapping("/product/{id}")
    public String showProduct(@PathVariable Long id, Model model) {
        Optional<Crystal> optionalCrystal = data.findById(id);

        if (optionalCrystal.isEmpty()) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        Crystal crystal = optionalCrystal.get();
        model.addAttribute("crystal", crystal);
        return "detailed_product";
    }
}
