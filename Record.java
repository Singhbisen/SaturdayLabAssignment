package SaturdayLabAssignment;

import java.io.*;

/*
 Q Define a class employee having fields like name ,age and salary .
define getdata () and ask employee record from user using buffered reader class .
b) create check method that check if salary > 20000 then add 10% to salary else add 15% to salary.
c) create display method() that display all record on console.
d) Create another class record having main method call all functions in main method.  
  */
 class Employee {
	String name;
	int age;
	double salary;
	
	void getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name:");
		name = br.readLine();
		System.out.println("Enter Age:");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter Salary:");
		salary = Float.parseFloat(br.readLine());
	}
	
	void check() {
		if(salary > 20000) {
			salary = salary + (salary*0.1);
		}
		else {
			salary = salary + (salary*0.15);
		}
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

public class Record{
public static void main(String[] args) throws IOException {
	Employee e = new Employee();
	e.getData();
	e.display();

	}

}