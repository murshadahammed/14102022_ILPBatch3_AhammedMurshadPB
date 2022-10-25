package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeDetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		String trainingName ="******* Welcome to ILP program*******";
		String employeeName;
		int employeeAge;
		char employeeGender;
		double employeeCgpa;
		
		System.out.println("Enter your employee name ");
		employeeName = scanner.nextLine();
		System.out.println("Enter your employee Age");
		employeeAge = scanner.nextInt();
		System.out.println("Enter your employee Gender ");
		employeeGender = scanner.next().charAt(0);
		System.out.println("Enter your employee CGPA");
		employeeCgpa = scanner.nextDouble();
		
		System.out.println(trainingName);
		System.out.println("Name" +"	"+"Age"+"	"+"Gender"+"	"+"CGPA");
		System.out.println(employeeName + "	" + employeeAge +"	" + employeeGender + "	" +employeeCgpa);
		
	}

}
