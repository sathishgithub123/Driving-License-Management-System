package com.codegnan.drivinglicense.controller;

import java.util.List;

import com.codegnan.drivinglicense.exceptions.LicenseNotFoundException;
import com.codegnan.drivinglicense.model.License;
import com.codegnan.drivinglicense.service.LicenseService;
import com.codegnan.drivinglicense.service.LicenseServiceImpl;

/**
 * Controller / Main class to execute the Driving License System
 */
public class LicenseController {

    public static void main(String[] args) {

        // Creating service reference (upcasting)
        LicenseService service = new LicenseServiceImpl();

        // -------------------- ADD / CREATE --------------------
        service.addLicense(new License(101, "Rakesh", 25, "LMV", "12-01-2022", "12-01-2032"));
        service.addLicense(new License(102, "Priya", 27, "MCWG", "05-06-2021", "05-06-2031"));
        service.addLicense(new License(103, "Suman", 30, "HMV", "10-03-2023", "10-03-2033"));

        System.out.println("▶ Licenses added successfully\n");

        // -------------------- READ ALL --------------------
        System.out.println("All Licenses:");
        List<License> licenses = service.getAllLicenses();
        for (License l : licenses) {
            System.out.println(l);
        }

        // -------------------- READ BY ID --------------------
        try {
            System.out.println("\nFetching License by ID: 102");
            System.out.println(service.getLicenseById(102));
        } catch (LicenseNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // -------------------- UPDATE --------------------
        try {
            System.out.println("\nUpdating License ID 103...");
            License updated = service.updateLicense(new License(103, "Sumanth", 30, "HMV", "10-03-2023", "10-03-2038"));
            System.out.println("Updated Record: " + updated);
        } catch (LicenseNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // -------------------- DELETE --------------------
        try {
            System.out.println("\nDeleting License ID 101...");
            service.deleteLicense(101);
            System.out.println("License deleted successfully");
        } catch (LicenseNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // -------------------- FINAL LIST --------------------
        System.out.println("\nFinal License List:");
        for (License l : service.getAllLicenses()) {
            System.out.println(l);
        }
    }
}
