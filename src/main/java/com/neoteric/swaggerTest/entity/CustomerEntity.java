package com.neoteric.swaggerTest.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="customer",schema = "customvalidations")
public class CustomerEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="customer_email")
    private String customerEmail;

    @Column(name="customer_phone")
    private String customerPhone;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",referencedColumnName = "address_id")
    private AddressEntity address;


    private LocalDate fromDate;

    private LocalDate toDate;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
