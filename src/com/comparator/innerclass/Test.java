package com.comparator.innerclass;

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
		Collections.sort(list,new CustomSorting.IdComparator());
		System.out.println(list);
		
		//Sorting BY Name
		System.out.println("Sorting By Name");
		Collections.sort(list,new CustomSorting.NameComparator());
		System.out.println(list);
		
		//Sorting BY Salary
		System.out.println("Sorting By Name");
		Collections.sort(list,new CustomSorting.NameComparator());
		System.out.println(list);
	
	}
}


