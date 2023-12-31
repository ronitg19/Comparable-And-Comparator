package com.comparator.separateclass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3, "C", 100));
		list.add(new Employee(2, "D", 300));
		list.add(new Employee(1, "B", 200));
		list.add(new Employee(4, "A", 400));
		
		 //Sorting BY ID
		System.out.println("Sorting By ID");
		Collections.sort(list, new IdComparator());
		System.out.println(list);
		//Sorting BY Name
		System.out.println("Sorting By Name");
		Collections.sort(list, new NameComparator());
		System.out.println(list);
		//Sorting By Salary
		System.out.println("Sorting By Salary");
		Collections.sort(list, new SalaryComparator());
		System.out.println(list);	
	}
}
