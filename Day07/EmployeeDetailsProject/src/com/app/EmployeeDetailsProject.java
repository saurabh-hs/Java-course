package com.app;

/*Question: Create an Employee Class in Java

1. Define a class Employee with the following attributes:
-name: String, represents the employee's name.
-jobTitle: String, represents the employee's job title.
-salary: double, represents the employee's salary.
2. Add the following methods to the Employee class:
-A constructor that initializes all three attributes.
-A method getDetails() that returns a formatted string containing the employee's details.
-A method increaseSalary(double percentage) that increases the employee's salary by the given percentage.
3. Create a subclass Manager that extends Employee and has an additional attribute department, which represents 
the department the manager is responsible for.
4. Implement the following in the Manager class:
-A constructor that initializes all attributes, including the inherited ones.
-Override the getDetails() method to include the department information.
-Add a method assignDepartment(String department) to set the department.
5. Write a Java program that creates instances of the Employee and Manager classes, sets their attributes, and calls 
their methods to display their details.

*/

import com.company.*;


public class EmployeeDetailsProject {

	public static void main(String[] args) {
		
		Employee e = new Employee("Sam","SDE",50000);
		System.out.println(e.getDetails());
		
		Manager m = new Manager("John","Manager",200000,"Development");
		System.out.println(m.getDetails());
		
		e.increaseSalary(10);
		
		System.out.println("After increment employee details");
		System.out.println(e.getDetails());
		
		m.assignDepartment("QA");
		System.out.println("After assign new department:");
		System.out.println(m.getDetails());

	}

}
