package com.codegnan.drivinglicense.service;

import java.util.List;

import com.codegnan.drivinglicense.doa.LicenseDao;
import com.codegnan.drivinglicense.doa.LicenseDaoImpl;
import com.codegnan.drivinglicense.exceptions.LicenseNotFoundException;
import com.codegnan.drivinglicense.model.License;


// Service implementation calling DAO logic

public class LicenseServiceImpl implements LicenseService {

    // Creating DAO reference (upcasting)
    LicenseDao dao = new LicenseDaoImpl();

    @Override
    public void addLicense(License license) {
        dao.save(license);
    }

    @Override
    public List<License> getAllLicenses() {
        return dao.findAll();
    }

    @Override
    public License getLicenseById(int id) throws LicenseNotFoundException {
        return dao.findById(id);
    }

    @Override
    public License updateLicense(License license) throws LicenseNotFoundException {
        return dao.update(license);
    }

    @Override
    public void deleteLicense(int id) throws LicenseNotFoundException {
        dao.deleteById(id);
    }
}
