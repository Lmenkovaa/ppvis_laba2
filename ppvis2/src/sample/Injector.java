package sample;

import controller.AdminManager;
import controller.BonusesPayWindowController;
import model.*;
import view.*;

public class Injector {
    NewAdminWindow newAdminWindow;
    NewTransportWindow newTransportWindow;
    NewTripWindow newTripWindow;
    AdminWindow adminWindow;
    AuthorizationAdminWindow authorizationAdminWindow;
    CardPayWindow cardPayWindow;
    TicketPurchaseWindow ticketPurchaseWindow;
    PrivateOfficeWindow privateOfficeWindow;
    UserWindow userWindow;
    AuthorizationCustomerWindow authorizationCustomerWindow;
    RegistrationWindow registrationWindow;
    StartWindow startWindow;
    BonusesPayWindow bonusesPayWindow;

    public Injector(){
        newTransportWindow = new NewTransportWindow();
        newTripWindow = new NewTripWindow(adminWindow);
        adminWindow = new AdminWindow(newAdminWindow, newTransportWindow, newTripWindow);
        newAdminWindow = new NewAdminWindow(adminWindow);
        authorizationAdminWindow = new AuthorizationAdminWindow(adminWindow);
        cardPayWindow = new CardPayWindow(cardPayWindow);
        ticketPurchaseWindow = new TicketPurchaseWindow(cardPayWindow, userWindow, bonusesPayWindow);
        privateOfficeWindow = new PrivateOfficeWindow();
        userWindow = new UserWindow(privateOfficeWindow, ticketPurchaseWindow);
        authorizationCustomerWindow = new AuthorizationCustomerWindow(userWindow);
        registrationWindow = new RegistrationWindow();
        startWindow = new StartWindow(authorizationCustomerWindow, authorizationAdminWindow, registrationWindow);

        Admin admin = new Admin();
        Customer customer = new Customer();
        Order order = new Order();
        PersonalData personalData = new PersonalData();
        PrivateOffice privateOffice = new PrivateOffice();
        Ticket ticket = new Ticket();
        Transport transport = new Transport();
        Trip trip = new Trip();
        AdminManager adminManager = new AdminManager();

    }

    public StartWindow startWindow(AuthorizationCustomerWindow authorizationCustomerWindow,
                                   AuthorizationAdminWindow authorizationAdminWindow, RegistrationWindow registrationWindow) {
        return startWindow;
    }
}
