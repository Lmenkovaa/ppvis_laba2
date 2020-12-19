package model;

public class Card {

    String cardNumber;
    String cvv;
    String dateValid;

    Card(String cardNumber, String cvv, String dateValid){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateValid = dateValid;
    }

    public void checkPayValid(String cardNumber, String cvv, String dateValid){
        System.out.println("Все данные реальны");
        System.out.println("Оплата прошла успешно");
    }
}
