package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3,"Toshit", 100000));
		list.add(new Employee(1,"Akshay", 50000));
		list.add(new Employee(2,"Ronit", 10000));
		list.add(new Employee(4,"Anand", 80000));
		Collections.sort(list);
		System.out.println(list);
	}

}
