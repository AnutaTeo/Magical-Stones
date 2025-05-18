package com.wad.firstmvc.controllers;

import com.wad.firstmvc.domain.Crystal;
import com.wad.firstmvc.services.CrystalData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminProductController {

    private final CrystalData crystalData;

    public AdminProductController(CrystalData crystalData) {
        this.crystalData = crystalData;
    }

    @GetMapping
    public String adminPanel(Model model) {
        model.addAttribute("crystals", crystalData.findAll());
        model.addAttribute("newCrystal", new Crystal());
        return "admin";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Crystal crystal) {
        crystalData.save(crystal);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        crystalData.deleteById(id);
        return "redirect:/admin";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Long id, @ModelAttribute Crystal updatedCrystal) {
        crystalData.update(id, updatedCrystal);
        return "redirect:/admin";
    }
}