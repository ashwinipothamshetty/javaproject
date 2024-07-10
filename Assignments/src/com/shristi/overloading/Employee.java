package com.shristi.overloading;

public class Employee {

	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	void printDetails() {
		System.out.println(name + " " +designation );
	}

	public double calcBonus(double basicAllowance) {
        return basicAllowance * 0.1;
    }

    public double calcBonus(double basicAllowance, double carAllowance) {
        return (basicAllowance + carAllowance) * 0.1;
    }

    public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
        return (basicAllowance + carAllowance + houseAllowance) * 0.1;
    }
}
