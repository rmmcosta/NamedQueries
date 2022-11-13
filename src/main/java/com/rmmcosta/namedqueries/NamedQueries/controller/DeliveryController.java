package com.rmmcosta.namedqueries.NamedQueries.controller;

import com.rmmcosta.namedqueries.NamedQueries.data.Delivery;
import com.rmmcosta.namedqueries.NamedQueries.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService deliveryService;

    @GetMapping("{name}")
    public List<Delivery> getAllDeliveriesByName(@PathVariable String name) {
        return deliveryService.getAllDeliveriesByName(name);
    }
}
