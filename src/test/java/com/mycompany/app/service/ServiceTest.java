package com.mycompany.app.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void testServiceName() {
        Service s = new Service();
        assertEquals("Service", s.getServiceName());
    }
}
