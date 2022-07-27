package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HotelReservation {

    static List<HotelData> hotelDataList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("welcome to Hotel Reservation");


        HotelData lakeWood = new HotelData("lakeWood", 110.00, 90.00, 3);
        hotelDataList.add(lakeWood);
        HotelData bridgeWood = new HotelData("bridgeWood", 150.00, 50.00, 4);
        hotelDataList.add(bridgeWood);
        HotelData ridgeWood = new HotelData("ridgeWood", 220.00, 150.00, 5);
        hotelDataList.add(ridgeWood);

        hotelDataList.forEach(output -> System.out.println(output));

        findCheapestHotelWeekdays("10-Sep-2020", "11-Sep-2020");
        findCheapestHotelWeekend("11-Sep-2020", "12-Sep-2020");
        findBestRatedHotel("11-Sep-2020", "12-Sep-2020");

    }

    public static void findCheapestHotelWeekdays(String bookingFromDate, String leavingDate) {
        LocalDate checkInDate = LocalDate.parse(bookingFromDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate checkOutDate = LocalDate.parse(leavingDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        int stayingDays = checkOutDate.getDayOfMonth() - checkInDate.getDayOfMonth() + 1;
        Optional<HotelData> cheapestHotel = hotelDataList.stream().sorted(Comparator.comparing(HotelData::getWeekdayRates))
                .findFirst();

        HotelData hotelData = new HotelData();
        hotelData.setHotelName(cheapestHotel.get().getHotelName());
        hotelData.setTotalPrice(cheapestHotel.get().getWeekdayRates() * stayingDays);
        System.out.println("Hotel Name " + hotelData.getHotelName());
        System.out.println("Total price in weekdays : " + stayingDays + hotelData.getTotalPrice());
    }

    public static void findCheapestHotelWeekend(String bookingFromDate, String leavingDate) {
        LocalDate checkInDate = LocalDate.parse(bookingFromDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate checkOutDate = LocalDate.parse(leavingDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        int stayingDays = checkOutDate.getDayOfMonth() - checkInDate.getDayOfMonth() + 1;
        Optional<HotelData> cheapestHotel = hotelDataList.stream().sorted(Comparator.comparing(HotelData::getWeekdayRates))
                .findFirst();

        HotelData hotelData = new HotelData();
        hotelData.setHotelName(cheapestHotel.get().getHotelName());
        hotelData.setTotalPrice(cheapestHotel.get().getWeekendRates() * stayingDays);
        System.out.println("Hotel Name " + hotelData.getHotelName());
        System.out.println("Total price in weekends : " + stayingDays + hotelData.getTotalPrice());
    }

    public static void findBestRatedHotel(String bookingFromDate, String leavingDate) {
        LocalDate checkInDate = LocalDate.parse(bookingFromDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate checkOutDate = LocalDate.parse(leavingDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        int stayingDays = checkOutDate.getDayOfMonth() - checkInDate.getDayOfMonth() + 1;
        HotelData cheapBestHotel = hotelDataList.stream()
                .filter(n -> n.hotelRating > 3)
                .max(Comparator.comparing(HotelData::getHotelRating))
                .orElse(null);

        HotelData hotelData = new HotelData();
        hotelData.setHotelName(cheapBestHotel.getHotelName());
        hotelData.setTotalPrice(cheapBestHotel.getWeekendRates() * stayingDays);
        System.out.println("Best Hotel is " + hotelData.getHotelName());
        System.out.println("Total price is : " + stayingDays + hotelData.getTotalPrice());
    }
}
