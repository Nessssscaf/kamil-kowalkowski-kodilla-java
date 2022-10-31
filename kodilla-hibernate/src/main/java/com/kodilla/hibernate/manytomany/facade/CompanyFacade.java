package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private CompanyDao companyDao;

    @Autowired
    public CompanyFacade(final CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public List<Company> searchCompany(String str) {
        return companyDao.searchCompany("%" + str + "%");
    }
}