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
@Table(name = Tables.EMAILS, schema = Schemas.PUBLIC)
public class Emails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "emails_email_id_seq")
    @Column(name = "emails_id")
    private Long emailsId;
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
        Emails emails = (Emails) o;
        return Objects.equals(emailsId, emails.emailsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailsId);
    }
}
