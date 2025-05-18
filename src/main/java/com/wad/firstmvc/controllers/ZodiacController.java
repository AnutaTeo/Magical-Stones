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
        if ("Aries".equals(sign) && "Love".equals(energy)) return "Rhodonite";
        if ("Aries".equals(sign) && "Creativity".equals(energy)) return "Carnelian";

        if ("Taurus".equals(sign) && "Protection".equals(energy)) return "Smoky Quartz";
        if ("Taurus".equals(sign) && "Love".equals(energy)) return "Rose Quartz";
        if ("Taurus".equals(sign) && "Creativity".equals(energy)) return "Aventurine";

        if ("Gemini".equals(sign) && "Protection".equals(energy)) return "Labradonite";
        if ("Gemini".equals(sign) && "Love".equals(energy)) return "Chrysoprase";
        if ("Gemini".equals(sign) && "Creativity".equals(energy)) return "Citrine";

        if ("Cancer".equals(sign) && "Protection".equals(energy)) return "Moonstone";
        if ("Cancer".equals(sign) && "Love".equals(energy)) return "Rhodocrosite";
        if ("Cancer".equals(sign) && "Creativity".equals(energy)) return "Aquamarine";

        if ("Leo".equals(sign) && "Protection".equals(energy)) return "Tiger's Eye";
        if ("Leo".equals(sign) && "Love".equals(energy)) return "Garnet";
        if ("Leo".equals(sign) && "Creativity".equals(energy)) return "Sunstone";

        if ("Virgo".equals(sign) && "Protection".equals(energy)) return "Fluorite";
        if ("Virgo".equals(sign) && "Love".equals(energy)) return "Pink Opal";
        if ("Virgo".equals(sign) && "Creativity".equals(energy)) return "Amzonite";

        if ("Libra".equals(sign) && "Protection".equals(energy)) return "Obsidian";
        if ("Libra".equals(sign) && "Love".equals(energy)) return "Rose Quartz";
        if ("Libra".equals(sign) && "Creativity".equals(energy)) return "Lapis Lazuli";

        if ("Scorpio".equals(sign) && "Protection".equals(energy)) return "Obsidian";
        if ("Scorpio".equals(sign) && "Love".equals(energy)) return "Rhodonite";
        if ("Scorpio".equals(sign) && "Creativity".equals(energy)) return "Garnet";

        if ("Sagittarius".equals(sign) && "Protection".equals(energy)) return "Jet";
        if ("Sagittarius".equals(sign) && "Love".equals(energy)) return "Tourmaline";
        if ("Sagittarius".equals(sign) && "Creativity".equals(energy)) return "Turquoise";

        if ("Capricorn".equals(sign) && "Protection".equals(energy)) return "Onyx";
        if ("Capricorn".equals(sign) && "Love".equals(energy)) return "Ruby";
        if ("Capricorn".equals(sign) && "Creativity".equals(energy)) return "Garnet";

        if ("Aquarius".equals(sign) && "Protection".equals(energy)) return "Hematite";
        if ("Aquarius".equals(sign) && "Love".equals(energy)) return "Kunzite";
        if ("Aquarius".equals(sign) && "Creativity".equals(energy)) return "Amethyst";

        if ("Pisces".equals(sign) && "Protection".equals(energy)) return "Tourmaline";
        if ("Pisces".equals(sign) && "Love".equals(energy)) return "Rose Quartz";
        if ("Pisces".equals(sign) && "Creativity".equals(energy)) return "Moonstone";

        return "Clear Quartz";
    }
}
