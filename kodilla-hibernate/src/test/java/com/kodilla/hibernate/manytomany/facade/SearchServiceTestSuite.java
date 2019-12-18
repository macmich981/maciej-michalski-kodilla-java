package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    SearchService searchService;

    @Test
    public void testGetCompaniesWithSpecificFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        List<Company> companies = new ArrayList<>();
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMaestersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        try {
            companies = searchService.getCompaniesWithSpecificFragment("Mast");
        } catch (SearchServiceException e) {

        }
        //Then
        Assert.assertEquals(1, companies.size());
        Assert.assertEquals("Data Masters", companies.get(0).getName());
        //CleanUp
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(dataMaestersId);
        companyDao.deleteById(greyMatterId);
    }

    @Test
    public void testGetEmployeesWithSpecificFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        List<Employee> employees = new ArrayList<>();
        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        try {
            employees = searchService.getEmployeesWithSpecificFragment("sky");
        } catch (SearchServiceException e) {

        }
        //Then
        Assert.assertEquals(1, employees.size());
        Assert.assertEquals("Kovalsky", employees.get(0).getLastname());
        //CleanUp
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieClarcksonId);
        employeeDao.deleteById(lindaKovalskyId);
    }
}
