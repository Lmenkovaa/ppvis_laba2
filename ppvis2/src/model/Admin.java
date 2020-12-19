package model;

public class Admin {

    private String login;
    private String password;

    public Admin() {
        login = "admin";
        password = "1111";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
