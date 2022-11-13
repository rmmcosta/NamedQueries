package com.rmmcosta.namedqueries.NamedQueries.service;

import com.rmmcosta.namedqueries.NamedQueries.data.Delivery;
import com.rmmcosta.namedqueries.NamedQueries.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    public List<Delivery> getAllDeliveriesByName(String name) {
        return deliveryRepository.findByName(name);
    }

    public Long save(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }
}
