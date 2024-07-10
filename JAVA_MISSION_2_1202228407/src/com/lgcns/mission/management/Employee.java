package com.lgcns.mission.management;

public class Employee {
	// Attributes
	private String id;
	private String name;
	private Department department;
	
	// Constructor
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		if (department != null && department.canAddEmployee()) {
		    // Check if the new department can accommodate the employee
		    if (this.department != null) {
		      // Remove employee from current department (if any)
		      this.department.deleteEmployee(this);
		    }

		    // Add employee to the new department
		    this.department = department;
		    department.addEmployee(this);
		  }
	}

	@Override
	public String toString() {
		return "ID:" + id + " Nama :" + name + " Departemen : " +  department.getName();
	}
	
	
}
