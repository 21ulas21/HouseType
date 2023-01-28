package com.egrikulas.housetype.model;

import lombok.ToString;


public class BaseEntity {

    private int hall;
    private int room;
    private Long price;
    private int size;

    public BaseEntity(int hall, int room, Long price, int size) {
        this.hall = hall;
        this.room = room;
        this.price = price;
        this.size = size;
    }



    public int getHall() {
        return hall;
    }

    public int getRoom() {
        return room;
    }

    public Long getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "hall=" + hall +
                ", room=" + room +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

