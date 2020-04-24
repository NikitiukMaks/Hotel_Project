package com.Model;

public class Guest {
    //GUEST PROPERTIES
    private String name;
    private String phoneNumber;
    private int guest_id;

    public Guest(String name, String phoneNumber, int guest_id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.guest_id = guest_id;
    }
    //SETTERS AND GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }















}
