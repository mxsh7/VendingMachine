package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> customersPets = new ArrayList<>();

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;

    }
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";

    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getCustomersPets() {
        return customersPets;
    }

    public void setCustomersPets(List<Pet> customersPets) {
        this.customersPets = customersPets;
    }


    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {

//        Map<String, Double> price = new HashMap<>();


        double serviceCost = 0.00;

        for (String service : servicesRendered.keySet()) {

                serviceCost += servicesRendered.get(service);
            }
            return serviceCost;


        }

    }


