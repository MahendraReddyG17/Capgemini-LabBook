package com.cg.lab7;

import com.cg.lab7.*;
import java.util.Scanner;

import com.cg.lab7.*;

public class EmployeeServiceImpl extends Employee implements EmployeeService{
	
	String insuranceScheme;
	public void getDetailsFromUser() {
		System.out.println("====================");
		System.out.println("Enter the emp id");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		System.out.println("Enter the emp salary:");
		int empsalary=sc.nextInt();
		System.out.println("Enter the emp designation of employee:");
		String empDesignation=sc.next();
		
		Employee eobj=new Employee();
		eobj.setId(empid);
		eobj.setSalary(empsalary);
		eobj.setDesination(empDesignation);
		int esalary=eobj.getSalary();
		String edesignation=eobj.getDesination();
		String einsurance=insuranceScheme(esalary,edesignation);
		eobj.setInsuranceScheme(einsurance);
		System.out.println("============================");
		System.out.println(eobj.getId());
		System.out.println(eobj.getSalary());
		System.out.println(eobj.getDesination());
		System.out.println(eobj.getInsuranceScheme());
		System.out.println("===========================");
}
	public String insuranceScheme(int empsalary,String empDesignation) {
		if((empsalary>5000&&empsalary<20000)&&(empDesignation.equals("System Associate"))) {
			insuranceScheme="Scheme C";
		}else if((empsalary>=20000&&empsalary<40000)&&(empDesignation.equals("Programmer"))) {
			insuranceScheme="Scheme B";
		}else if((empsalary>=40000)&&(empDesignation.equals("Manager"))){
			insuranceScheme="Scheme A";
		}else if((empsalary<5000)&&(empDesignation.equals("Clerk"))) {
			insuranceScheme="None";
		}
		return insuranceScheme;
	
	}

}
