package com.mycompany.app.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ServiceTest {

    @Test
    public void testServiceName() {
        Service s = new Service();
        assertEquals("Service", s.getServiceName());
    }

    @Test
    public void testServiceId() {
        Service s = new Service();
        assertTrue(s.getServiceId() < 20);
    }
}
