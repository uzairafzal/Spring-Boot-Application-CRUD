package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/get/all")
    public List<Employee> getAll(){
        return empService.getAll();
    }
    @PostMapping("/add")
    public String getAll(@RequestBody Employee emp){
        return empService.add(emp);
    }
    @PutMapping("/edit")
    public String edit(@RequestBody Employee emp){
        return empService.edit(emp);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int empNo){
        return empService.delete(empNo);
    }
}
