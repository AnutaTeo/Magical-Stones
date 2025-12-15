package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.Crystal;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CrystalData {
    private final List<Crystal> crystals = new ArrayList<>();
    private Long nextId = 1L;

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
        c1.setColor("White");
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

        Crystal c7 = new Crystal();
        c7.setId(7L);
        c7.setName("Red Carnelian");
        c7.setSubtitle("A stone of passion and grounding spiritual energy");
        c7.setDescription("A talisman for ambition, performance (Singer's Stone), and success.");
        c7.setImage("red-carnelian.jpeg");
        c7.setMoreImage("red-carnelian-necklace.jpeg");
        c7.setDetailTitle("Red Carnelian Necklace");
        c7.setPrice(4.80);
        c7.setDetailPrice(15.99);
        c7.setColor("Red");
        c7.setDimensions("Pendant: 2cm, Chain: 45cm");
        c7.setBenefits("Enhances courage, motivation and focus.");
        c7.setZodiacInfo("Aries, Leo");
        crystals.add(c7);

        Crystal c8 = new Crystal();
        c8.setId(8L);
        c8.setName("Selenite");
        c8.setSubtitle("A stone of amplifying energy and promoting calm.");
        c8.setDescription("Opal is an amazing stone for balance, harmony, and amplifying your positive powers.");
        c8.setImage("selenite.jpeg");
        c8.setMoreImage("selenite-necklace.jpeg");
        c8.setDetailTitle("Selenite Necklace");
        c8.setPrice(4.80);
        c8.setDetailPrice(15.99);
        c8.setColor("White");
        c8.setDimensions("Pendant: 2cm, Chain: 45cm");
        c8.setBenefits("Used for spiritual cleansing.");
        c8.setZodiacInfo("Taurus, Cancer");
        crystals.add(c8);

        Crystal c9 = new Crystal();
        c9.setId(9L);
        c9.setName("Obsidian");
        c9.setSubtitle("A stone of clarity and transformation");
        c9.setDescription("Obsidian shields from negativity, bad intentions and psychic attacks");
        c9.setImage("obsidian.jpeg");
        c9.setMoreImage("obsidian-necklace.jpeg");
        c9.setDetailTitle("Obsidian Necklace");
        c9.setPrice(4.80);
        c9.setDetailPrice(15.99);
        c9.setColor("Black");
        c9.setDimensions("Pendant: 2cm, Chain: 45cm");
        c9.setBenefits("Connects you to Earth's energy, providing stability");
        c9.setZodiacInfo("Scorpio, Capricorn");
        crystals.add(c9);


        Crystal c10 = new Crystal();
        c10.setId(10L);
        c10.setName("Citrine");
        c10.setSubtitle("A stone of joy and abundance");
        c10.setDescription("Citrine is an amazing stone symbolizing optimism, the sun's energy and manifesting goals");
        c10.setImage("citrine.jpeg");
        c10.setMoreImage("citrine-necklace.jpeg");
        c10.setDetailTitle("Citrine Necklace");
        c10.setPrice(4.80);
        c10.setDetailPrice(15.99);
        c10.setColor("Yellow");
        c10.setDimensions("Pendant: 2cm, Chain: 45cm");
        c10.setBenefits("Radiates warmth, positivity, optimism, and vitalizing energy.");
        c10.setZodiacInfo("Scorpio, Saggitarius");
        crystals.add(c10);

        Crystal c11 = new Crystal();
        c11.setId(11L);
        c11.setName("Red Agate");
        c11.setSubtitle("A stone of grounding and resilience");
        c11.setDescription("Used in talismans to amplify personal traits, enhance luck and connect to your sign's attributes.");
        c11.setImage("red-agate.jpeg");
        c11.setMoreImage("red-agate-necklace.jpeg");
        c11.setDetailTitle("Red Agate Necklace");
        c11.setPrice(4.80);
        c11.setDetailPrice(15.99);
        c11.setColor("Red");
        c11.setDimensions("Pendant: 2cm, Chain: 45cm");
        c11.setBenefits("Enhances courage, self-confidence and determination.");
        c11.setZodiacInfo("Capricorn, Taurus");
        crystals.add(c11);

        Crystal c12 = new Crystal();
        c12.setId(12L);
        c12.setName("Apatite");
        c12.setSubtitle("A stone of growth and clarity");
        c12.setDescription("Apatite is an amazing stone that helps with appetite control and metabolism.");
        c12.setImage("apatite.jpeg");
        c12.setMoreImage("apatite-necklace.jpeg");
        c12.setDetailTitle("Apatite Necklace");
        c12.setPrice(4.80);
        c12.setDetailPrice(15.99);
        c12.setColor("Blue");
        c12.setDimensions("Pendant: 2cm, Chain: 45cm");
        c12.setBenefits("Associated with inspiration and spiritual insight.");
        c12.setZodiacInfo("Gemini, Libra");
        crystals.add(c12);
    }

    public List<Crystal> findAll() {
        return crystals;
    }

    public Optional<Crystal> findById(Long id) {
        return crystals.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public void save(Crystal crystal) {
        crystal.setId(nextId++);
        crystals.add(crystal);
    }

    public void deleteById(Long id) {
        crystals.removeIf(c -> c.getId().equals(id));
    }

    public void update(Long id, Crystal updated) {
        for (int i = 0; i < crystals.size(); i++) {
            if (crystals.get(i).getId().equals(id)) {
                updated.setId(id); // preserve ID
                crystals.set(i, updated);
                return;
            }
        }
    }
}