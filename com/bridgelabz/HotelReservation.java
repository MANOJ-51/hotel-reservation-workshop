package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("welcome to Hotel Reservation");

        List<HotelData> hotelDataList = new ArrayList<>();
        HotelData lakeWood = new HotelData("lakeWood", 110.00);
        hotelDataList.add(lakeWood);
        HotelData bridgeWood = new HotelData("bridgeWood", 160.00);
        hotelDataList.add(bridgeWood);
        HotelData ridgeWood = new HotelData("ridgeWood", 220.00);
        hotelDataList.add(ridgeWood);

        System.out.println(hotelDataList);
    }
}
