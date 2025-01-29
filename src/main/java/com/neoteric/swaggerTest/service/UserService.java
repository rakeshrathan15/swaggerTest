package com.neoteric.swaggerTest.service;


import com.neoteric.swaggerTest.entity.AddressEntity;
import com.neoteric.swaggerTest.entity.NomineeEntity;
import com.neoteric.swaggerTest.entity.UserEntity;
import com.neoteric.swaggerTest.model.AddressModel;
import com.neoteric.swaggerTest.model.User;
import com.neoteric.swaggerTest.repository.UserRepository;

//@Service
public class UserService {

   // @Autowired
     public UserRepository userRepository;


    public UserEntity saveUser(User user){


        AddressEntity userAddress = mapToAddressEntity(user.getAddress());
        AddressEntity nomineeAddress= mapToAddressEntity(user.getNominee().getAddress());

        NomineeEntity nomineeEntity= new NomineeEntity();
        nomineeEntity.setNomineeName(user.getNominee().getNomineeName());
        nomineeEntity.setNomineeRelation(user.getNominee().getRelation());
        nomineeEntity.setAddressEntity(nomineeAddress);


        UserEntity userEntity= new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        userEntity.setAddressEntity(userAddress);
        userEntity.setNomineeEntity(nomineeEntity);

        return userEntity;
    }

    public AddressEntity mapToAddressEntity(AddressModel address){
        AddressEntity addressEntity= new AddressEntity();
        addressEntity.setStreet(address.getStreet());
        addressEntity.setCity(address.getCity());
        addressEntity.setState(address.getState());
        addressEntity.setPincode(address.getPincode());
        return addressEntity;
    }

    public void someMethod(User user) {
        // Access the address of the user
        AddressModel address = user.getAddress(); // This requires User to have getAddress()
        System.out.println("User Address: " + address.getStreet());
    }




}
