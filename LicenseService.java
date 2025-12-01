package com.codegnan.drivinglicense.service;

import java.util.List;

import com.codegnan.drivinglicense.exceptions.LicenseNotFoundException;
import com.codegnan.drivinglicense.model.License;


// Service layer interface calling DAO methods

public interface LicenseService {

    void addLicense(License license);

    List<License> getAllLicenses();

    License getLicenseById(int id) throws LicenseNotFoundException;

    License updateLicense(License license) throws LicenseNotFoundException;

    void deleteLicense(int id) throws LicenseNotFoundException;
}
