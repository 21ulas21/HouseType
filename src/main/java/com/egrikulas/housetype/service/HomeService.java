package com.egrikulas.housetype.service;

import com.egrikulas.housetype.model.BaseEntity;
import com.egrikulas.housetype.model.House;
import com.egrikulas.housetype.model.SummerHouse;
import com.egrikulas.housetype.model.Villa;


import java.util.ArrayList;
import java.util.List;

public class HomeService {

    List<Villa> villaList = new ArrayList<>();
    List<House> houseList = new ArrayList<>();
    List<SummerHouse> summerHouseList = new ArrayList<>();

    public void addVilla(Villa villa){
        villaList.add(villa);
    }
    public void addHouse(House house){
        houseList.add(house);
    }
    public void addSummerHouse(SummerHouse summerHouse){
        summerHouseList.add(summerHouse);
    }
    public List<Villa> getVillaList(){
        return villaList;
    }
    public List<House> getHouseList(){
        return houseList;
    }
    public List<SummerHouse> getSummerHouseList(){
        return summerHouseList;
    }
    public Long getHouseTotalPrice(){
        Long temp=0L;
        for (House house:houseList) {
            temp=temp+house.getPrice();
        }
        return temp;
    }
    public Long getVillaTotalPrice(){
        Long temp=0L;
        for (Villa villa:villaList) {
            temp=temp+villa.getPrice();
        }
        return temp;
    }public Long getSummerHouseTotalPrice(){
        Long temp=0L;
        for (SummerHouse summerHouse:summerHouseList) {
            temp=temp+summerHouse.getPrice();
        }
        return temp;
    }
    public Long getAllTotalPrice(){
        return getHouseTotalPrice()+getVillaTotalPrice()+getSummerHouseTotalPrice();
    }

    public double getAvgHouseSize(){
        double temp=0;
        for (House house:houseList) {
            temp=temp+house.getSize();
        }
        return temp/houseList.size();
    }

    public double getAvgSummerHouseSize(){
        double temp=0;
        for (SummerHouse summerHouse:summerHouseList) {
            temp=temp+summerHouse.getSize();
        }
        return temp/summerHouseList.size();
    }

    public double getAvgVillaSize(){
        double temp=0;
        for (Villa villa:villaList) {
            temp=temp+villa.getSize();
        }
        return temp/villaList.size();
    }

    public double getAllAvgSize(){
        return getAvgHouseSize()+getAvgVillaSize()+getAvgSummerHouseSize();
    }
    public List<BaseEntity> RoomAndHallFilter(int room, int hall){
        List<BaseEntity> baseEntityList = new ArrayList<>();
        for (House house:houseList) {
            if(house.getRoom()==room && house.getHall()==hall){
                baseEntityList.add(house);
            }

        }
        for (SummerHouse summerHouse:summerHouseList) {
            if(summerHouse.getRoom()==room && summerHouse.getHall()==hall){
                baseEntityList.add(summerHouse);
            }

        }
        for (Villa villa:villaList) {
            if(villa.getRoom()==room && villa.getHall()==hall){
                baseEntityList.add(villa);
            }

        }
        return  baseEntityList;
    }


}