package com.codegnan.drivinglicense.model;

// Driving License

public class License {

	// Unique ID for each driving license
	private int licenseId;

	// Name of the driving license holder
	private String holderName;

	// Age of the applicant
	private int age;

	// Vehicle type (LMV / HMV / MCWG / etc.)
	private String vehicleType;

	// Date when the license was issued
	private String issueDate;

	// Date when the license expires
	private String expiryDate;

	// No-argument constructor
	public License() {
		super();
	}

	// Parameterized constructor
	public License(int licenseId, String holderName, int age, String vehicleType, String issueDate, String expiryDate) {
		super();
		this.licenseId = licenseId;
		this.holderName = holderName;
		this.age = age;
		this.vehicleType = vehicleType;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	// Getters and Setters
	public int getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	// toString to print License object
	@Override
	public String toString() {
		return "License [licenseId=" + licenseId + ", holderName=" + holderName + ", age=" + age + ", vehicleType="
				+ vehicleType + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + "]";
	}
}
