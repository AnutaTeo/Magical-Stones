package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.Crystal;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CrystalData {
    private final List<Crystal> crystals = new ArrayList<>();

    public CrystalData() {
        Crystal c1 = new Crystal();
        c1.setId(1L);
        c1.setName("Opal");
        c1.setSubtitle("A stone of balance and harmony");
        c1.setDescription("Opal is an amazing stone for balance, harmony, and amplifying your positive powers.");
        c1.setImage("opal.jpeg");
        c1.setMoreImage("opal-necklace.png");
        c1.setDetailTitle("Opal Necklace");
        c1.setPrice(4.80);
        c1.setDetailPrice(15.99);
        c1.setColor("White, Iridescent");
        c1.setDimensions("Pendant: 2cm, Chain: 45cm");
        c1.setBenefits("Enhances creativity, boosts optimism, and supports emotional healing.");
        c1.setZodiacInfo("Libra, Cancer");
        crystals.add(c1);

        Crystal c2 = new Crystal();
        c2.setId(2L);
        c2.setName("Blue Onyx");
        c2.setSubtitle("A calming, grounding stone");
        c2.setDescription("Used to enhance intuition and help remove toxic traits and habits.");
        c2.setImage("blue-onyx.jpeg");
        c2.setMoreImage("blue-onyx-necklace.png");
        c2.setDetailTitle("Blue Onyx Pendant");
        c2.setPrice(4.80);
        c2.setDetailPrice(15.50);
        c2.setColor("Blue");
        c2.setDimensions("Pendant: 3cm, Chain: 50cm");
        c2.setBenefits("Improves focus, reduces stress, and clears negative energy.");
        c2.setZodiacInfo("Sagittarius, Capricorn");
        crystals.add(c2);

        Crystal c3 = new Crystal();
        c3.setId(3L);
        c3.setName("Malachite");
        c3.setSubtitle("Stone of transformation");
        c3.setDescription("Clears and activates chakras; fosters emotional healing and balance.");
        c3.setImage("malachite.jpeg");
        c3.setMoreImage("malachite-necklace.png");
        c3.setDetailTitle("Malachite Necklace");
        c3.setPrice(4.80);
        c3.setDetailPrice(18.00);
        c3.setColor("Green");
        c3.setDimensions("Pendant: 2.5cm, Chain: 42cm");
        c3.setBenefits("Brings balance, emotional healing, and protection.");
        c3.setZodiacInfo("Scorpio, Capricorn");
        crystals.add(c3);

        Crystal c4 = new Crystal();
        c4.setId(4L);
        c4.setName("Jade");
        c4.setSubtitle("Symbol of harmony and virtue");
        c4.setDescription("Jade covers themes of harmony, eternity, and virtue.");
        c4.setImage("jade.jpeg");
        c4.setMoreImage("jade-necklace.png");
        c4.setDetailTitle("Jade Crystal Necklace");
        c4.setPrice(4.80);
        c4.setDetailPrice(14.99);
        c4.setColor("Green");
        c4.setDimensions("Pendant: 2.2cm, Chain: 45cm");
        c4.setBenefits("Attracts good luck, prosperity, and protection.");
        c4.setZodiacInfo("Virgo, Taurus");
        crystals.add(c4);

        Crystal c5 = new Crystal();
        c5.setId(5L);
        c5.setName("Tigers Eye");
        c5.setSubtitle("Stone of protection and confidence");
        c5.setDescription("A stone of protection from negative energy and good luck.");
        c5.setImage("tigers-eye.jpeg");
        c5.setMoreImage("tigers-eye-necklace.png");
        c5.setDetailTitle("Tigers Eye Necklace");
        c5.setPrice(4.80);
        c5.setDetailPrice(16.50);
        c5.setColor("Brown-Gold");
        c5.setDimensions("Pendant: 2.8cm, Chain: 45cm");
        c5.setBenefits("Boosts self-confidence and decision-making.");
        c5.setZodiacInfo("Leo, Capricorn");
        crystals.add(c5);

        Crystal c6 = new Crystal();
        c6.setId(6L);
        c6.setName("Tourmaline");
        c6.setSubtitle("Stone of protection and confidence");
        c6.setDescription("A stone for cleaning, purifying and transforming dense energy into a light vibration");
        c6.setImage("tourmaline.jpeg");
        c6.setMoreImage("tourmaline-necklace.png");
        c6.setDetailTitle("Tourmaline Necklace");
        c6.setPrice(4.80);
        c6.setDetailPrice(26.50);
        c6.setColor("Pink");
        c6.setDimensions("Pendant: 2.8cm, Chain: 45cm");
        c6.setBenefits("Protection against destructive energies and bad vibrations.");
        c6.setZodiacInfo("Gemini, Virgo");
        crystals.add(c6);
    }

    public List<Crystal> findAll() {
        return crystals;
    }

    public Optional<Crystal> findById(Long id) {
        return crystals.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}