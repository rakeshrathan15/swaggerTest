package com.neoteric.swaggerTest.model;


public class Nominee {


    private String nomineeName;
    private  String relation;

  //  private User user;

    private AddressModel address;

    public Nominee(){

    }

    public Nominee(String nomineeName, String relation, AddressModel address) {
        this.nomineeName = nomineeName;
        this.relation = relation;
        this.address = address;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
}
