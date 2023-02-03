package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {


    @Test
    public void getBlanceDue() {


    Customer customer = new Customer("John", "Petowner");

        Map<String, Double> testService = new HashMap<>();
        testService.put("Grooming ", 15.00);
        testService.put("Walking ", 10.00);
        testService.put("Sitting ", 5.00);
        testService.put("Nail Clipping ", 10.00);

        double totalServices = customer.getBalanceDue(testService);

        Assert.assertEquals(40.00, totalServices, 0.0);

}


}
