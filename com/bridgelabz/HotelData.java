package com.bridgelabz;

public class HotelData {
    String hotelName;
    double weekdayRates;
    double weekendRates;
    double totalPrice;

    public HotelData() {
    }

    public HotelData(String hotelName, double weekdayRates, double weekendRates) {
        this.hotelName = hotelName;
        this.weekdayRates = weekdayRates;
        this.weekendRates = weekendRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getWeekdayRates() {
        return weekdayRates;
    }

    public void setWeekdayRates(double weekdayRates) {
        this.weekdayRates = weekdayRates;
    }

    public double getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(double weekendRates) {
        this.weekendRates = weekendRates;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "HotelData{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRates=" + weekdayRates +
                ", weekendRates=" + weekendRates +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
