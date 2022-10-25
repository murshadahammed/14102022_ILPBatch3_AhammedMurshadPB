package com.ilpexperion.objectclassbasic;

public class Employee {
	String employeeName ="sunish";
	int employeeAge = 36;
	char employeeGender ='m';
	double employeeCgpa = 8.5;
	
	
	public void displayEmployeeDetails() {
	System.out.println("Name" +"	"+"Age"+"	"+"Gender"+"	"+"CGPA");
	System.out.println(employeeName + "	" + employeeAge +"	" + employeeGender + "	" +employeeCgpa);
	
}


}
