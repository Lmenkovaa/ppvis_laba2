package model;

import java.util.ArrayList;

public class PrivateOffice {
    private ArrayList<Order> orders;
    private PersonalData personalData;

    public PrivateOffice() {
        orders = new ArrayList<>();
        personalData = new PersonalData();
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
