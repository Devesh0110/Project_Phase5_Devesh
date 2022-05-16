package com.ecomerce.webapp;

import org.springframework.stereotype.Repository;
 
import com.ecomerce.webapp.Employee;
import com.ecomerce.webapp.Employees;
 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Devesh", "Singh", "deveshsingh0110@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
