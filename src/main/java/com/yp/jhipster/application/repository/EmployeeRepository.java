package com.yp.jhipster.application.repository;

import com.yp.jhipster.application.domain.Employee;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Employee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
