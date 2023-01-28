package com.egrikulas.housetype.model;

import java.math.BigDecimal;

public class SummerHouse extends BaseEntity{


    public SummerHouse(int hall, int room, Long price, int size) {
        super(hall, room, price, size);
    }

    @Override
    public String toString() {
        return "SummerHouse " + super.toString();
    }


}
