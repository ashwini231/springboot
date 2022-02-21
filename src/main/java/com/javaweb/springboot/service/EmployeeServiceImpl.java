package com.javaweb.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.javaweb.springboot.model.Employee;
import com.javaweb.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	public void saveEmployee(Employee employee){
		this.employeeRepository.save(employee);
	}
	
	public Page<Employee> findPaginated(int pageNo, int pageSize){
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return this.employeeRepository.findAll(pageable);
		
	}
}
