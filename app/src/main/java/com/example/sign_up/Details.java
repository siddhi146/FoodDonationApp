package com.example.sign_up;

public class Details {
    private String firstname, lastname, email, address;
    private Long phn;

    public Details() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhn() {
        return phn;
    }

    public void setPhn(Long phn) {
        this.phn = phn;
    }
}

