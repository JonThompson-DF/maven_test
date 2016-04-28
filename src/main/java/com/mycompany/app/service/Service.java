package com.mycompany.app.service;

import java.util.Random;

public class Service {

    public String getServiceName() {
        return "Service";
    }

    public int getServiceId() {
        return new Random().nextInt(10);
    }
}
