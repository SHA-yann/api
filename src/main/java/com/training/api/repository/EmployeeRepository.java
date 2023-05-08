package com.training.api.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.api.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
