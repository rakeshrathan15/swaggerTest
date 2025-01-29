package com.neoteric.swaggerTest.entity;

//@Entity

//@Table(name = "user",schema = "validations")

public class UserEntity {

  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "id")
    private Long id;

  //  @Column(name="user_name")
    private String userName;

  //  @Column(name = "email")
    private String email;

  //  @Column(name = "phone_number")
    private String phoneNumber;

//@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "address_id",referencedColumnName = "address_id")
    private AddressEntity addressEntity;

//@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "nominee_id",referencedColumnName = "nominee_id")
    private NomineeEntity nomineeEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public NomineeEntity getNomineeEntity() {
        return nomineeEntity;
    }

    public void setNomineeEntity(NomineeEntity nomineeEntity) {
        this.nomineeEntity = nomineeEntity;
    }
}
