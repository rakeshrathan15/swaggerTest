package com.neoteric.swaggerTest.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerModel {


    @NotBlank(message = "Customer Name is Required")
    @Size(min = 5, max = 10)
    private String customerName;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Customer Email is Required")
    private String customerEmail;

    @Size(min=10, max = 10,message = "Phone number must be exactly 10 digits.")
    @Pattern(regexp = "^[0-9]*$")
    private String cuastomerPhone;

    private AddressModel addressModel;

    @Pattern(
            regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$",
            message = "Password must be at least 8 characters long, contain at least one letter, one number, and one special character."
    )
    private String password;

    public CustomerModel(){

    }

    public CustomerModel(String customerName, String customerEmail, String cuastomerPhone, AddressModel addressModel) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.cuastomerPhone = cuastomerPhone;
        this.addressModel = addressModel;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCuastomerPhone() {
        return cuastomerPhone;
    }

    public void setCuastomerPhone(String cuastomerPhone) {
        this.cuastomerPhone = cuastomerPhone;
    }

    public AddressModel getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }
}
