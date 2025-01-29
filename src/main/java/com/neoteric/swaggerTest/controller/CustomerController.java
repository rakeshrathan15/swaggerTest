package com.neoteric.swaggerTest.controller;


import com.neoteric.swaggerTest.api.CustomerApi;
import com.neoteric.swaggerTest.entity.CustomerEntity;
import com.neoteric.swaggerTest.model.CustomerModel;
import com.neoteric.swaggerTest.repository.CustomerRepository;
import com.neoteric.swaggerTest.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@RestController
//@RequestMapping("/api/user")
public class CustomerController  implements CustomerApi {

   // @Autowired
     public CustomerService customerService;

  //  @Autowired
     public CustomerRepository customerRepository;


//    @PostMapping("/create")
//    public ResponseEntity<CustomerEntity> createUser(@Valid @RequestBody CustomerModel user){
//        CustomerEntity userEntity= customerService.saveCustomer(user);
//
//
//        customerRepository.save(userEntity);
//        return ResponseEntity.ok(userEntity);
//    }


  //  @GetMapping("/getEmail")
    public ResponseEntity<CustomerEntity> getUser( String email){
        CustomerEntity customerEntity=customerService.getCustomerByEmail(email);

        return ResponseEntity.ok(customerEntity);




    }

    // Fetch customer by email using query parameter
//    @GetMapping("/by-email")
//    public ResponseEntity<CustomerEntity> getCustomerByEmail(@RequestParam String email) {
//        Optional<CustomerEntity> customer = customerRepository.findByCustomerEmail(email);
//        if (customer.isPresent()) {
//            return ResponseEntity.ok(customer.get());
//        }
//        return ResponseEntity.notFound().build();
//    }
//
//    // Fetch customer by ID using path variable
//    @GetMapping("/{id}")
//    public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable Long id) {
//        Optional<CustomerEntity> customer = customerRepository.findById(id);
//        if (customer.isPresent()) {
//            return ResponseEntity.ok(customer.get());
//        }
//        return ResponseEntity.notFound().build();
//    }


//    @Override
//
//    @PostMapping("/createCustomer")
//    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
//        // Add your business logic here
//       // Customer customer1= customerService.saveCustomer(customer)
//        return ResponseEntity.ok(customer);
//    }

//    @Override
//    @GetMapping("/getCustomer")
//    public ResponseEntity<Customer> getCustomer() {
//        // Return dummy data or integrate with your service
//        Customer customer = new Customer();
//        customer.setCustomerName("Lokesh");
//        customer.setCustomerEmail("Doe@gmail.com");
//        customer.setCuastomerPhone("7013776567");
//       // customer.setAddress(new Address("b));
//        return ResponseEntity.ok(customer);
//    }








}
