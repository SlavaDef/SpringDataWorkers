package com.task.boot.entity;

import com.task.boot.utils.Schemas;
import com.task.boot.utils.constants.Tables;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = Tables.ADDRESS, schema = Schemas.PUBLIC)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "")
    @Column(name = "address_id")
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


}
