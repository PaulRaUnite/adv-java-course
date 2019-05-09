package com.pavlo_tokariev.spring_data.repository;

import com.pavlo_tokariev.spring_data.model.Group;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Long> {
    List<Group> findByName(String firstName);
}
