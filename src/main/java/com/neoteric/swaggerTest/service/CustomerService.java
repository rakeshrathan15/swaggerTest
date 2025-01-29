package com.neoteric.swaggerTest.service;

import com.neoteric.swaggerTest.customvalidations.Customer;
import com.neoteric.swaggerTest.entity.AddressEntity;
import com.neoteric.swaggerTest.entity.CustomerEntity;
import com.neoteric.swaggerTest.model.AddressModel;
import com.neoteric.swaggerTest.model.CustomerModel;
import com.neoteric.swaggerTest.repository.CustomValidationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    public CustomValidationRepository customerRepository;



//    public CustomerEntity saveCustomer(CustomerModel user){
//
//
//        AddressEntity userAddress = mapToAddressEntity1(user.getAddressModel());
//       // AddressEntity nomineeAddress= mapToAddressEntity1(user.getNominee().getAddress());
//
////        NomineeEntity nomineeEntity= new NomineeEntity();
////        nomineeEntity.setNomineeName(user.getNominee().getNomineeName());
////        nomineeEntity.setNomineeRelation(user.getNominee().getRelation());
////        nomineeEntity.setAddressEntity(nomineeAddress);
//
//
//        CustomerEntity userEntity= new CustomerEntity();
//        userEntity.setCustomerName(user.getCustomerName());
//        userEntity.setCustomerEmail(user.getCustomerEmail());
//        userEntity.setCustomerPhone(user.getCuastomerPhone());
//        userEntity.setAddress(userAddress);
//       // userEntity.set(nomineeEntity);
//
//        return userEntity;
//    }










    @Transactional

    public CustomerEntity customValidation(Customer user){


        AddressEntity userAddress = mapToAddressEntity1(user.getAddressModel());
       //  AddressEntity nomineeAddress= mapToAddressEntity1(user.getNominee().getAddress());



        CustomerEntity userEntity= new CustomerEntity();
        userEntity.setCustomerName(user.getName());
        userEntity.setCustomerEmail(user.getEmail());
        userEntity.setCustomerPhone(user.getCustomerPhone());
        userEntity.setAddress(userAddress);
         userEntity.setFromDate(user.getFromDate());
         userEntity.setToDate(user.getToDate());

         return userEntity;


    }

    public AddressEntity mapToAddressEntity1(AddressModel address){
        AddressEntity addressEntity= new AddressEntity();
        addressEntity.setStreet(address.getStreet());
        addressEntity.setCity(address.getCity());
        addressEntity.setState(address.getState());
        addressEntity.setPincode(address.getPincode());
        return addressEntity;
    }

    public CustomerEntity getCustomerByEmail(String email) {
        // Logic to fetch customer by email from DB
        return new CustomerEntity(); // Replace with actual DB fetch logic
    }

    public CustomerEntity getCustomerById(Long id) {
        // Logic to fetch customer by ID from DB
        return new CustomerEntity(); // Replace with actual DB fetch logic
    }

    public CustomerEntity updateCustomer(Long id, CustomerModel customerModel) {
        // Logic to update customer by ID
        return new CustomerEntity(); // Replace with actual DB update logic
    }









}
