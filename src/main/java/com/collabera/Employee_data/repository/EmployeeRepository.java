package com.collabera.Employee_data.repository;

//import com.collabera.Employee_data.entity.Employee;
import com.collabera.Employee_data.entity.Employee;
//import com.collabera.Employee_data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
