package com.aurionpro.test;
import com.aurionpro.model.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sarah",new Consultant());
		System.out.print(emp.getGetDescription()+"\n");
		System.out.println(emp.getResponsibility());
		System.out.println("--------------------------");
		emp.promote(new SeniorConsultant());
		System.out.print(emp.getGetDescription()+"\n");
		System.out.println(emp.getResponsibility());
		emp.promote(new TechLead());
		System.out.println("--------------------------");
		System.out.print(emp.getGetDescription()+"\n");
		System.out.println(emp.getResponsibility());

	}

}
