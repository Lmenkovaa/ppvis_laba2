package model;

public class Transport {
    String carNumber;
    String carType;
    boolean conditioner;
    boolean powerSocket;
    boolean wiFi;
    int numberOfSeats;

    public Transport() {
        carNumber = "1111";
        carType = "маршрутка";
        conditioner = false;
        powerSocket = false;
        wiFi = false;
        numberOfSeats = 9;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setPowerSocket(boolean powerSocket) {
        this.powerSocket = powerSocket;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
