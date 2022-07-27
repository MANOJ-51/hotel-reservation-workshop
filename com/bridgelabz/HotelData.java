package com.bridgelabz;

public class HotelData {
    String hotelName;
    double hotelRates;

    double totalPrice;

    public HotelData() {
    }

    public HotelData(String hotelName, double hotelRates) {
        this.hotelName = hotelName;
        this.hotelRates = hotelRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getHotelRates() {
        return hotelRates;
    }

    public void setHotelRates(double hotelRates) {
        this.hotelRates = hotelRates;
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
                ", hotelRates=" + hotelRates +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
