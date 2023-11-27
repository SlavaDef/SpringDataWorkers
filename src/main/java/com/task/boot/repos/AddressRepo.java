package com.task.boot.repos;

import com.task.boot.entity.Address;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {

}
