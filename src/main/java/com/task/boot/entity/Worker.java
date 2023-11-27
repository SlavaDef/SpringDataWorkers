package com.task.boot.entity;


import com.task.boot.utils.Schemas;
import com.task.boot.utils.constants.Tables;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = Tables.WORKER, schema = Schemas.PUBLIC)
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "worker_id")
    private Long workerId;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    @Column(length = 5)
    private Boolean married;
    private String department;
}
