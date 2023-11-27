package com.task.boot.repos;

import com.task.boot.entity.Emails;
import com.task.boot.entity.Worker;
import org.springframework.data.repository.CrudRepository;

public interface EmailsRepo extends CrudRepository<Emails,Long> {
}
