package model;

import java.util.Date;

public class Trip {
    private int tripNumber;
    private int price;
    private String departureCity;
    private String arrivalCity;
    private String landingPoint;
    private String dropOffPoint;
    private Date departureTime;
    private Date arrivalTime;

    public Trip() {
        tripNumber = 1;
        price = 0;
        departureCity = "";
        arrivalCity = "";
        landingPoint = "";
        dropOffPoint = "";
        departureTime = new Date();
        arrivalTime = new Date();
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDropOffPoint(String dropOffPoint) {
        this.dropOffPoint = dropOffPoint;
    }

    public void setLandingPoint(String landingPoint) {
        this.landingPoint = landingPoint;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDropOffPoint() {
        return dropOffPoint;
    }

    public String getLandingPoint() {
        return landingPoint;
    }

    public int getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(int tripNumber) {
        this.tripNumber = tripNumber;
    }
}
