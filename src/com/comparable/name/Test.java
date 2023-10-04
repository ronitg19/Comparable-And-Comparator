package com.comparable.name;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
 public static void main(String[] args) {
	ArrayList<Employee> list = new ArrayList<Employee>();
	list.add(new Employee(2, "A", 400));
	list.add(new Employee(4, "D", 300));
	list.add(new Employee(1, "B", 200));
	list.add(new Employee(3, "C", 100));
	
	Collections.sort(list);
	System.out.println(list);
}
}
