package com.task.boot.entity;


import com.task.boot.utils.Schemas;
import com.task.boot.utils.constants.Tables;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = Tables.WORKER, schema = Schemas.PUBLIC)
public class Worker {

    public Worker() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "worker_worker_id_seq")
    @Column(name = "worker_id",nullable = false)
    private Long workerId;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    @Column(length = 5)
    private Boolean married;
    @Column(name = "gender")
    private String gender;
    private String department;
    @OneToMany(mappedBy = "workerId")
    private List<Address> address;
    @OneToMany(mappedBy = "workerId")
    private List<Emails> emails;
    @OneToMany(mappedBy = "workerId")
    private List<Phones> phones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(workerId, worker.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId);


    }
}
