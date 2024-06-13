package org.emp.controller.employee;

import org.emp.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/add-employeeController")
public class EmployeeController {
    List<Employee> employeeList = new ArrayList<>();

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeList.add(employee);
    }

    @GetMapping("get-all")
    public List<Employee> getAll(){
        return employeeList;
    }
}
