package org.emp;

import org.company.Company;
import org.project.Project;
//import packagename.classname
import org.client.Client;
public class Employee {
	
	public void empname()
	{
		System.out.println("adhvik");
	}
	public static void main(String args[])
	{
		Employee e=new Employee();
		Company c=new Company();
		Project p=new Project();
		Client y=new Client();
		c.companyname();
		e.empname();
		y.clientname();
		p.projectname();
		
		
		
		
		
	}

}
