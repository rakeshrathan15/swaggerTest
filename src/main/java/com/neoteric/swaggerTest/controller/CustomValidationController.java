package com.neoteric.swaggerTest.controller;


import com.neoteric.swaggerTest.customvalidations.Customer;
import com.neoteric.swaggerTest.entity.CustomerEntity;
import com.neoteric.swaggerTest.repository.CustomValidationRepository;
import com.neoteric.swaggerTest.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/custom")
public class CustomValidationController {

//    @PostMapping("/validation")
//    public ResponseEntity<CustomerEntity> customerValidation(@Valid @RequestBody Customer customer){
//        CustomerEntity userEntity= customerService.saveCustomer(user);
//
//
//        customerRepository.save(userEntity);
//        return ResponseEntity.ok(userEntity);
//    }

//    @PostMapping("/validation")
//    public ResponseEntity<Cu> addUser(@Valid @RequestBody Customer user, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            StringBuilder errorMessage = new StringBuilder();
//            bindingResult.getAllErrors().forEach(error -> {
//                errorMessage.append(error.getDefaultMessage()).append("; ");
//            });
//            return ResponseEntity.badRequest().body(errorMessage.toString());
//        }
//        return ResponseEntity.ok("User registered successfully!");
//    }
//

    @Autowired
    public CustomerService customerService;

    @Autowired
    public CustomValidationRepository customerRepository;


    @PostMapping("/create")
    public ResponseEntity<CustomerEntity> createUser(@Valid @RequestBody Customer user){
        CustomerEntity userEntity= customerService.customValidation(user);


        customerRepository.save(userEntity);
        return ResponseEntity.ok(userEntity);
    }

}
