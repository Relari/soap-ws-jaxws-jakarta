package com.pe.relari.webservice;

import com.pe.relari.service.impl.EmployeeServiceImpl;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import com.pe.relari.model.Employee;
import com.pe.relari.service.EmployeeService;

import java.util.List;

@WebService(serviceName = "EmployeeWS")
public class EmployeeResource {

    EmployeeService employeeService = EmployeeServiceImpl.getInstance();

//    public EmployeeResource(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    @WebMethod(operationName = "getEmployee")
    public Employee getEmployee(
            @WebParam(name = "EmployeeId") Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @WebMethod(operationName = "findAll")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

}