package com.pe.relari.service.impl;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees = EmployeeRepository.employees();

    private static EmployeeService instance = null;

    public static EmployeeService getInstance() {
        if (instance == null) {
            instance = new EmployeeServiceImpl();
        }
        return instance;
    }

    public Employee getEmployee(Integer employeeId) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(employeeId))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }
}
