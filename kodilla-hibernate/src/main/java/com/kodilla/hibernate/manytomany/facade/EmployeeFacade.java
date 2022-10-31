package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeFacade(final EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> searchEmployee(String str) {
        return employeeDao.searchEmployee("%" + str + "%");
    }
}