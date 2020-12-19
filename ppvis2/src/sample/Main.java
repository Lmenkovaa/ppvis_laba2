package sample;
import view.*;

public class Main{

    public static void main(String []args){

        Injector injector = new Injector();
        StartWindow startWindow = injector.startWindow(injector.authorizationCustomerWindow,
                injector.authorizationAdminWindow, injector.registrationWindow);
        startWindow.setVisible(true);

    }
}
