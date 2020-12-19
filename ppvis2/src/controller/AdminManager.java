package controller;

import model.Admin;
import model.Customer;
import model.Transport;
import model.Trip;

import java.util.ArrayList;

public class AdminManager {
    ArrayList<Admin> admins;

    public AdminManager(){
        admins = new ArrayList<>();
    }

    public void addAdmin(Admin admin) {
        this.admins.add(admin);
    }

    public void deleteAdmin(Admin admin){

    }

    public void updateAdmin(Admin admin){

    }
}
