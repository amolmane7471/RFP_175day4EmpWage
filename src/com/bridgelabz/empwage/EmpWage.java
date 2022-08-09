package com.bridgelabz.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Pgm");
		/*
		 * UC1 : check for employee attendance
		 */
		int IS_FULLTIME = 1;
		int IS_PARTTIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs;
		int empWage;
		double empcheck = Math.floor(Math.random()*10)%3;
		if(empcheck == IS_FULLTIME)
		{	empHrs = 8;
			System.out.println("Emp is full time present");
		}
		/*
		 * UC3 : calculate employee wage for part time
		 */
		else if(empcheck == IS_PARTTIME)
		{
			empHrs = 4;
			System.out.println("Emp is part time present");
		}
		else 
		{
			empHrs=0;
		    System.out.println("Emp is Absent");
		}
		/*
		 * UC2 : calculate daily employee wage
		 */
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:"+empWage);

	}

}
