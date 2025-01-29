package com.neoteric.swaggerTest.entity;

//@Entity
//@Table(name = "nominee",schema = "validations")

public class NomineeEntity {

  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "nominee_id")
    private Long nomineeId;

  //  @Column(name = "nominee_name")
    private String nomineeName;

  //  @Column(name = "nominee_relation")
    private String nomineeRelation;


  //  @OneToOne(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "address_id",referencedColumnName = "address_id")
    private AddressEntity addressEntity;

    public Long getNomineeId() {
        return nomineeId;
    }

    public void setNomineeId(Long nomineeId) {
        this.nomineeId = nomineeId;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getNomineeRelation() {
        return nomineeRelation;
    }

    public void setNomineeRelation(String nomineeRelation) {
        this.nomineeRelation = nomineeRelation;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }
}
