package com.egrikulas.housetype;

import com.egrikulas.housetype.model.BaseEntity;
import com.egrikulas.housetype.model.House;
import com.egrikulas.housetype.model.SummerHouse;
import com.egrikulas.housetype.model.Villa;
import com.egrikulas.housetype.service.HomeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HouseTypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseTypeApplication.class, args);


        HomeService homeService = new HomeService();
        //                      hall(salon sayısı)-room(oda sayısı)-price(fiyat)-size(metrekare)
        Villa villa1=new Villa(3,6,250000L,3000);
        Villa villa2=new Villa(2,5,200000L,2000);
        Villa villa3=new Villa(1,3,125000L,1700);
        homeService.addVilla(villa1);
        homeService.addVilla(villa2);
        homeService.addVilla(villa3);
        // Villa tipinde nesnelerimiz oluşturulduğu ve servis katmanındaki liste kaydedildiği kısım

        House house1=new House(2,5,200000L,1350);
        House house2=new House(1,3,165000L,1200);
        House house3=new House(1,1,112500L,1000);
        homeService.addHouse(house1);
        homeService.addHouse(house2);
        homeService.addHouse(house3);
        //Ev tipindeki nesnelerimizin oluşturulduğu ve servis katmanındaki liste kaydedildiği kısım


        SummerHouse summerHouse1 = new SummerHouse(3,5,750000L,1850);
        SummerHouse summerHouse2 = new SummerHouse(2,4,600000L,1600);
        SummerHouse summerHouse3 = new SummerHouse(1,3,500000L,1300);
        homeService.addSummerHouse(summerHouse1);
        homeService.addSummerHouse(summerHouse2);
        homeService.addSummerHouse(summerHouse3);
        // Yazlık ev tipindeki nesnelerimizin oluşturulduğu ve servis katmanındaki liste kaydedildiği kısım
        System.out.println("----------------------------------");
        System.out.println("Total Price Of Houses = "+homeService.getHouseTotalPrice() );
        System.out.println("Total Price Of SummerHouses = "+homeService.getSummerHouseTotalPrice() );
        System.out.println("Total Price Of Villas = "+homeService.getVillaTotalPrice() );
        System.out.println("Total price of all types of houses = "+homeService.getAllTotalPrice());
        System.out.println("----------------------------------");
        System.out.println("Average square meter of houses = "+ homeService.getAvgHouseSize());
        System.out.println("Average square meter of Summerhouses = "+ homeService.getAvgSummerHouseSize());
        System.out.println("Average square meter of Villa = "+ homeService.getAvgVillaSize());
        System.out.println("Average square meter of houses of all types = "+homeService.getAllAvgSize());
        System.out.println("---------------------------------");
        System.out.println("Room count = 3, Hall count = 1 houses  all types");
        homeService.RoomAndHallFilter(3,1).forEach(baseEntity -> {
            System.out.print(baseEntity+" - ");
        });
        // Bizden istenen metotların çıktılarını aldığımız kısım













    }

}
