package com.egrikulas.housetype.model;

import java.math.BigDecimal;

public class Villa extends BaseEntity{


    public Villa(int hall, int room, Long price, int size) {
        super(hall, room, price, size);
    }

    @Override
    public String toString() {
        return "Villa " + super.toString();
    }
}
