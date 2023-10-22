package com.pokecard.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pocards {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int order;
private String front_default;
private String name;
private String base_experience;

    public Pocards(int order, String front_default, String name, String base_experience) {
        this.order = order;
        this.front_default = front_default;
        this.name = name;
        this.base_experience = base_experience;
    }

    public Pocards() {
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }

    @Override
    public String toString() {
        return "Pocards{" +
                "order=" + order +
                ", front_default='" + front_default + '\'' +
                ", name='" + name + '\'' +
                ", base_experience='" + base_experience + '\'' +
                '}';
    }
}
