package com.wad.firstmvc;

import com.wad.firstmvc.domain.CartItem;
import com.wad.firstmvc.domain.Crystal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartItemTest {

    @Test
    void testSubtotalCalculation() {
        Crystal crystal = new Crystal();
        crystal.setId(1L);
        crystal.setName("Opal");
        crystal.setColor("White");
        crystal.setPrice(4.8);

        CartItem item = new CartItem(crystal, 5);

        assertEquals(24.0, item.getSubtotal());
    }

    @Test
    void testQuantityChange() {
        Crystal crystal = new Crystal();
        crystal.setId(1L);
        crystal.setName("Opal");
        crystal.setColor("White");
        crystal.setPrice(4.8);

        CartItem item = new CartItem(crystal, 1);

        item.setQuantity(5);
        assertEquals(24.0, item.getSubtotal());
    }
}
