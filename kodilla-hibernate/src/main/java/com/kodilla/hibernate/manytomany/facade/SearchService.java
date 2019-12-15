package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchService.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> getCompaniesWithSpecificFragment(String searchFragment) throws SearchServiceException {
        List<Company> companies = companyDao.retrieveCompaniesWithSpecificFragment(searchFragment);
        if (companies.size() == 0) {
            LOGGER.error(SearchExceptionValue.ERR_COMPANY_NOT_FOUND.name());
            throw new SearchServiceException(SearchExceptionValue.ERR_COMPANY_NOT_FOUND.name());
        } else {
            return companies;
        }
    }

    public List<Employee> getEmployeesWithSpecificFragment(String searchFragment) throws SearchServiceException {
        List<Employee> employees = employeeDao.retrieveEmployeesWithSpecificFragment(searchFragment);
        if (employees.size() == 0) {
            LOGGER.error(SearchExceptionValue.ERR_EMPLOYER_NOT_FOUND.name());
            throw new SearchServiceException(SearchExceptionValue.ERR_EMPLOYER_NOT_FOUND.name());
        } else {
            return employees;
        }
    }
}
