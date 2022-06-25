package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmpRepository {


    public ArrayList<Employee> employee = new ArrayList<Employee>();


    public List<Employee> getAll() {
        return employee;
    }

    public String add(Employee emp) {
        employee.add(emp);
        return "Successfully Added";
    }

    public String edit(Employee emp) {
        employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
            e.setAddress(emp.getAddress());
            e.setName(emp.getName());
        });
        return "Successfully Changed";
    }

    public String delete(int empNo) {
        employee.remove(empNo-1);
        return "Successfully Deleted";
    }
}
