package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3, "Toshit", 100000));
		list.add(new Employee(2, "Ronit", 10000));
		list.add(new Employee(1, "Akshay", 50000));
		list.add(new Employee(4, "Anand", 80000));
		
		Collections.sort(list, new NameComparator());
		System.out.println(list);
		
		Collections.sort(list, new SalaryComparator());
		System.out.println(list);

	}

}
