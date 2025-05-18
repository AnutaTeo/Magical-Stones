package com.wad.firstmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CartItem {
    private Crystal product;
    @Setter
    private int quantity;

    public CartItem(Crystal product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }


}