package com.collabera.Employee_data.service;

import com.collabera.Employee_data.entity.Employee;
import com.collabera.Employee_data.model.EmployeeData;
import com.collabera.Employee_data.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements  EmployeeService
{
    @Autowired
    private  EmployeeRepository employeeRepository;

//    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
//    {
//        this.employeeRepository = employeeRepository;
//    }

    // when you want to save the data at that time convert model class to entity class.
    @Override
    public EmployeeData createData(EmployeeData employeeData)
    {
        Employee employeeEntity = new Employee();
        BeanUtils.copyProperties(employeeData, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employeeData;
    }

    //When i want to get the data then follow step: 1.convert entity class to model class
    @Override
    public List<EmployeeData> getAllData()
    {
        List<Employee> employees = employeeRepository.findAll();//get the data from EMPLOYEE

        //And convert into the EmployeeData
        List<EmployeeData> employeeData = employees.stream()
            .map(emp -> new EmployeeData(
                emp.getId(),
                emp.getFirstName(),
                emp.getLastName(),
                emp.getAddress(),
                emp.getExperiance(),
                emp.getPosition(),
                emp.getSallary()))
                .collect(Collectors.toList());
        return employeeData;
    }
}
