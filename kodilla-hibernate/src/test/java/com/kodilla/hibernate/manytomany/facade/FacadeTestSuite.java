package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeFacade employeeFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSearchCompany() {

        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Marcin", "Nowak");
        Employee employee3 = new Employee("Jerzy", "Malinowski");

        Company firstCompany = new Company("Microsoft");
        Company secondCompany = new Company("Apple");

        firstCompany.getEmployees().add(employee1);
        firstCompany.getEmployees().add(employee3);
        secondCompany.getEmployees().add(employee2);

        employee1.getCompanies().add(firstCompany);
        employee2.getCompanies().add(secondCompany);
        employee3.getCompanies().add(firstCompany);

        //When
        companyDao.save(firstCompany);
        companyDao.save(secondCompany);

        List<Company> companies = companyFacade.searchCompany("Mic");

        //Then
        assertEquals(1, companies.size());

        //Clean up
        companyDao.deleteAll();
    }

    @Test
    void testSearchEmployee() {

        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Marcin", "Nowak");
        Employee employee3 = new Employee("Jerzy", "Malinowski");

        Company firstCompany = new Company("Microsoft");
        Company secondCompany = new Company("Apple");

        firstCompany.getEmployees().add(employee1);
        firstCompany.getEmployees().add(employee3);
        secondCompany.getEmployees().add(employee2);

        employee1.getCompanies().add(firstCompany);
        employee2.getCompanies().add(secondCompany);
        employee3.getCompanies().add(firstCompany);

        //When
        companyDao.save(firstCompany);
        companyDao.save(secondCompany);

        List<Employee> employees = employeeFacade.searchEmployee("mal");

        //Then
        assertEquals(1, employees.size());

        //Clean up
        employeeDao.deleteAll();
    }
}