package com.neoteric.swaggerTest.customvalidations;



import com.neoteric.swaggerTest.model.AddressModel;

import java.time.LocalDate;

@DateValidation

public class Customer {

    private String name;
    private String email;

   // @DateValidation(message = "from Date Customer class  ")
    private LocalDate fromDate;

    //@DateValidation(message = "To Date Customer class  ")
    private LocalDate toDate;

    private AddressModel addressModel;

  //  private String cuastomerPhone;
  private String customerPhone;  // Fix typo from cuastomerPhone


    public AddressModel getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }



    public Customer(){

    }


    public Customer(String name, String email, LocalDate fromDate, LocalDate toDate, AddressModel addressModel, String customerPhone) {
        this.name = name;
        this.email = email;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.addressModel = addressModel;
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() {

        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
