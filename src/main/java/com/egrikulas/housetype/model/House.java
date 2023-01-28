package com.egrikulas.housetype.model;

import java.math.BigDecimal;

public class House extends BaseEntity{


    public House(int hall, int room, Long price, int size) {
        super(hall, room, price, size);
    }

    @Override
    public String toString() {
        return "House " + super.toString();
    }
}
