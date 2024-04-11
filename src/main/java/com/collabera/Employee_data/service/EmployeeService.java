package com.collabera.Employee_data.service;
import com.collabera.Employee_data.model.EmployeeData;

import java.util.List;

public interface EmployeeService
{
    EmployeeData createData(EmployeeData employeeData);

    List<EmployeeData> getAllData();
}
