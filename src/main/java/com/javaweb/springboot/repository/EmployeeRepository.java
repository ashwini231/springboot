package com.javaweb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaweb.springboot.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
