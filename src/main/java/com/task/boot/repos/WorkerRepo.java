package com.task.boot.repos;

import com.task.boot.entity.Worker;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepo extends CrudRepository<Worker,Long> {
}
