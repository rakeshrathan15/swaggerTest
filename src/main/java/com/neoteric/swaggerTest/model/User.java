package com.neoteric.swaggerTest.model;


//import org.hibernate.validator.constraints.NotBlank;

public class User {

   // @NotBlank(message = "Name cannot be blank")
    private String userName;

    private String email;

    private String phoneNumber;

    private Nominee nominee;

    private AddressModel address;

    public User(){

    }

    public User(String userName, String email, String phoneNumber, Nominee nominee, AddressModel address) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nominee = nominee;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Nominee getNominee() {
        return nominee;
    }

    public void setNominee(Nominee nominee) {
        this.nominee = nominee;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
}
