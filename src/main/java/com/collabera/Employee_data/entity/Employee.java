package com.collabera.Employee_data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private  String lastName;
    private String address;
    private int experiance;
    private String position;
    private Long sallary;
}
