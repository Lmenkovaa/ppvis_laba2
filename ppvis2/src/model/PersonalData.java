package model;

public class PersonalData {
    private String fullName;
    private String phoneNumber;
    private int bonuses;

    public PersonalData() {
        fullName = "";
        phoneNumber = "";
        bonuses = 0;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    public int getBonuses() {
        return bonuses;
    }
}
