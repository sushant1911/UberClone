package com.example.user.uberclone;

public class Driver {
    private String email,password;
    public Driver()
    {

    }

    public Driver(String email, String password ) {
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
