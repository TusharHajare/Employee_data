package com.collabera.Employee_data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeData
{
    private int id;
    private String firstName;
    private  String lastName;
    private String address;
    private int experiance;
    private String position;
    private Long sallary;
}
