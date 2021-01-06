package com.kamkaczo.springboot.crud.dao;

import com.kamkaczo.springboot.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
