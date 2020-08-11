package com.bartek.spring_thymeleaf_crud_mysql1.repository;

import com.bartek.spring_thymeleaf_crud_mysql1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
