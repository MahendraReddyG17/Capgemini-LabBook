package com.cg.lab7;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String desination;
	private  String insuranceScheme;
	
	/*public Employee() {
		
	}
	public Employee(int id,String name,int salary, String desination,String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desination = desination;
		this.insuranceScheme = insuranceScheme;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
   /* System.out.println(insuranceScheme);
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", desination=" + desination
				+ ", insuranceScheme=" + insuranceScheme ;
	}*/
	
}

