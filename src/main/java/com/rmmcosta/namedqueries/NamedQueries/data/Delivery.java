package com.rmmcosta.namedqueries.NamedQueries.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(
        name = "Delivery.findByName",
        query = "Select d from Delivery d where d.name = :name"
)
@Entity
public class Delivery {
    @GeneratedValue
    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
