package com.codegnan.drivinglicense.doa;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.drivinglicense.exceptions.LicenseNotFoundException;
import com.codegnan.drivinglicense.model.License;


// Implements CRUD operations using ArrayList as storage

public class LicenseDaoImpl implements LicenseDao {

    // Simulating database with ArrayList
    List<License> licenseList = new ArrayList<>();

    // CREATE operation 
    @Override
    public void save(License license) {
        licenseList.add(license);   // adding license object to list
    }

    // READ ALL operation
    @Override
    public List<License> findAll() {
        return licenseList;
    }

    // READ BY ID operation 
    @Override
    public License findById(int id) throws LicenseNotFoundException {
        for (License l : licenseList) {
            if (l.getLicenseId() == id) {
                return l;  // return record if found
            }
        }
        throw new LicenseNotFoundException("License with ID " + id + " not found");
    }

    // UPDATE operation 
    @Override
    public License update(License license) throws LicenseNotFoundException {
        for (int i = 0; i < licenseList.size(); i++) {
            if (licenseList.get(i).getLicenseId() == license.getLicenseId()) {
                licenseList.set(i, license);   // replace old object
                return license;
            }
        }
        throw new LicenseNotFoundException("Cannot update — License with ID " + license.getLicenseId() + " not found");
    }

    // DELETE operation 
    @Override
    public void deleteById(int id) throws LicenseNotFoundException {
        for (int i = 0; i < licenseList.size(); i++) {
            if (licenseList.get(i).getLicenseId() == id) {
                licenseList.remove(i);
                return;
            }
        }
        throw new LicenseNotFoundException("Cannot delete — License with ID " + id + " not found");
    }
}

