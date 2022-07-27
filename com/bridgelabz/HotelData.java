package com.bridgelabz;

public class HotelData {
    String hotelName;
    double hotelRate;

    public HotelData(String hotelName, double hotelRate) {
        this.hotelName = hotelName;
        this.hotelRate = hotelRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getHotelRate() {
        return hotelRate;
    }

    public void setHotelRate(double hotelRate) {
        this.hotelRate = hotelRate;
    }

    @Override
    public String toString() {
        return "HotelData{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRate=" + hotelRate +
                '}';
    }
}
