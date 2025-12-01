package com.codegnan.drivinglicense.doa;

import java.util.List;

import com.codegnan.drivinglicense.exceptions.LicenseNotFoundException;
import com.codegnan.drivinglicense.model.License;


// DAO interface performing CRUD operations

public interface LicenseDao {

	void save(License license); // CREATE

	List<License> findAll(); // READ ALL

	License findById(int id) throws LicenseNotFoundException; // READ ONE

	License update(License license) throws LicenseNotFoundException; // UPDATE

	void deleteById(int id) throws LicenseNotFoundException; // DELETE
}
