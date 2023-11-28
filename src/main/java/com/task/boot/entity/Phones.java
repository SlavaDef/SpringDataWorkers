package com.task.boot.entity;

import com.task.boot.utils.Schemas;
import com.task.boot.utils.constants.Tables;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = Tables.PHONES, schema = Schemas.PUBLIC)
public class Phones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "phones_phones_id_seq")
    @Column(name = "phones_id")
    private Long phonesId;
    @Column(length = 50)
    private String work;
    @Column(length = 50)
    private String home;
    @Column(length = 50)
    private String reserve;
    @Column(name = "worker_id")
    private Long workerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phones phones = (Phones) o;
        return Objects.equals(phonesId, phones.phonesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonesId);
    }
}
