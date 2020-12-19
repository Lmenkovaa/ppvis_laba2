package model;

public class Customer {
    String password;
    PersonalData personalData;
    PrivateOffice privateOffice;

    public Customer() {
        password = "1111";
        personalData = new PersonalData();
        privateOffice = new PrivateOffice();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPrivateOffice(PrivateOffice privateOffice) {
        this.privateOffice = privateOffice;
    }

    public PrivateOffice getPrivateOffice() {
        return privateOffice;
    }
}
