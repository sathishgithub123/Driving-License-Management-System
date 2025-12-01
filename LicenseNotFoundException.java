package com.codegnan.drivinglicense.exceptions;


//Custom exception thrown when a license ID does not exist

public class LicenseNotFoundException extends Exception {

    public LicenseNotFoundException(String message) {
        super(message);
    }
}
