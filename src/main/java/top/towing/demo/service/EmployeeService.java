package top.towing.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.towing.demo.domain.Employee;
import top.towing.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
}
