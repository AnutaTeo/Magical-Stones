package com.wad.firstmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ZodiacController {
    @PostMapping("/zodiac_form")
    public String handleForm(@RequestParam String name,
                             @RequestParam String zodiacSign,
                             @RequestParam String desiredEnergy,
                             Model model) {

        String match = matchCrystal(zodiacSign, desiredEnergy);
        model.addAttribute("name", name);
        model.addAttribute("crystal", match);
        return "zodiac_result";
    }

    private String matchCrystal(String sign, String energy) {
        //mai punem chestii personalizate daca e pe viitor
        if ("Aries".equals(sign) && "Protection".equals(energy)) return "Red Jasper";
        if ("Cancer".equals(sign)) return "Moonstone";
        if ("Gemini".equals(sign)) return "Agate";
        if ("Pisces".equals(sign)) return "Amethyst";
        return "Clear Quartz";
    }
}
