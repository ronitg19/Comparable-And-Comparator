package com.comparable.salary;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3,"B", 10000));
		list.add(new Employee(1,"C", 40000));
		list.add(new Employee(2,"A", 20000));
		list.add(new Employee(4,"D", 30000));
		
		Collections.sort(list);
		System.out.println(list);
	}
}
