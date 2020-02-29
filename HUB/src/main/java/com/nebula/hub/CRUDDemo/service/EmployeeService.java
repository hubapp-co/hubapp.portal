package com.nebula.hub.CRUDDemo.service;

import java.util.List;

import com.nebula.hub.CRUDDemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int thesId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
