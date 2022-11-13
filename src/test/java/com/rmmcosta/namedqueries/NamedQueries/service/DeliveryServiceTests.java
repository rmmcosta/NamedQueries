package com.rmmcosta.namedqueries.NamedQueries.service;

import com.rmmcosta.namedqueries.NamedQueries.data.Delivery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DeliveryServiceTests {
    @Autowired
    DeliveryService deliveryService;

    @Test
    public void getTwoOutOfThreeDeliveriesByName() {
        Delivery delivery = new Delivery();
        delivery.setName("Zé");
        deliveryService.save(delivery);
        delivery = new Delivery();
        delivery.setName("Joaquim");
        deliveryService.save(delivery);
        delivery = new Delivery();
        delivery.setName("Zé");
        deliveryService.save(delivery);
        List<Delivery> deliveries2Ze = deliveryService.getAllDeliveriesByName("Zé");
        assertEquals(2,deliveries2Ze.size());
        for (Delivery d : deliveries2Ze) {
            assertEquals("Zé", d.getName());
        }
    }
}
