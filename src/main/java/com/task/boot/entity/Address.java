package com.task.boot.entity;

import com.task.boot.utils.Schemas;
import com.task.boot.utils.constants.Tables;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = Tables.ADDRESS, schema = Schemas.PUBLIC)
public class Address {
    public Address() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_address_id_seq")
    @Column(name = "address_id",nullable = false)
    private Long addressId;
    @Column(nullable = false, length = 100)
    private String city;
    private String street;
    @Column(length = 10)
    private Integer house;
    @Column(length = 10)
    private String apartment; // квартира
    @Column(length = 50)
    private String country;
    @Column(name = "worker_id")
    private Long workerId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addressId, address.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId);
    }
}
