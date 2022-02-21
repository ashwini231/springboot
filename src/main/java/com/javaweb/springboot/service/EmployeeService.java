package com.javaweb.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import com.javaweb.springboot.model.*;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Page<Employee> findPaginated(int pageNo, int pageSize);
}
