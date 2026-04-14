package com.plurasight;

public class CellPhone {
    //Properties
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // Constructor
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";


        }
    //Getter and Setter
    //Serial Number
    public int getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    //Model
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    //Carrier
    public String getCarrier(){
        return carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    //Phone Number
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    //Owner
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
