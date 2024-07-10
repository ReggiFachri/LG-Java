package com.lgcns.mission.management;

public class ManagementTest {

	public static void main(String[] args) {

		String[] nameList = {
				"Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway", "Rita Rangel", 
				"Waldo Ontiveros", "Milton Grantham", "Loura Swilley", "Lola Duropan", "Kandis Mcnary", 
				"Milford Kirts", "Denita Taniguchi", "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux", 
				"Fernanda Overby", "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"};

		// Initiate employeeList array
		int numEmployees = nameList.length;
		Employee[] employeeList = new Employee[numEmployees];

		// Create department object
		Department dept01 = new Department("DEPT01", "Tim Teknis", 100);
		Department dept02 = new Department("DEPT02", "Tim SDM", 5);
		Department dept03 = new Department("DEPT03", "Tim Keamanan", 5);

		// Add employees to the list
		for (int i = 0; i < numEmployees; i++) {
			String employeeId = "EMP" + String.format("%02d", i + 1); 
			String employeeName = nameList[i];
			employeeList[i] = new Employee(employeeId, employeeName);
		}

		// Assign all employees to dept01
		for (Employee employee : employeeList) {
			employee.setDepartment(dept01);
		}

		// Show employees in each dept (before)
		dept01.printEmployeeList();
		dept03.printEmployeeList();
		dept02.printEmployeeList();

		// Move employees
		for (Employee employee : employeeList) {
			int employeeId = Integer.parseInt(employee.getId().substring(3)); // Extract ID number

			if (employeeId % 5 == 0) { // Move x5 employee to dept03
				employee.setDepartment(dept03);
			} else if (employeeId % 2 == 0) { // Move even employee to dept02
				employee.setDepartment(dept02);
			}
		}

		System.out.print("\n\n");
		// Show employees in each dept after
		dept01.printEmployeeList();
		dept03.printEmployeeList();
		dept02.printEmployeeList();
	}

}
