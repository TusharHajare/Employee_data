package com.collabera.Employee_data.controller;

//import com.collabera.Employee_data.model.Employee;
//import com.collabera.Employee_data.model.EmployeeData;
//import com.collabera.Employee_data.model.employeeData;
import com.collabera.Employee_data.model.EmployeeData;
import com.collabera.Employee_data.service.EmployeeService;
import com.collabera.Employee_data.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

//    public EmployeeController(EmployeeService employeeService)
//    {
//        this.employeeService = employeeService;
//    }

    @PostMapping("/employees")
    public EmployeeData createData(@RequestBody EmployeeData employeeData)
    {
        return employeeService.createData(employeeData);
    }

    @GetMapping("/employees")
    public List<EmployeeData> getAllData()
    {
        return employeeService.getAllData();
    }

}
