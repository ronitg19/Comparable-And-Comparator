package com.comparator.innerclass;

import java.util.Comparator;

public class CustomSorting {
	
	static class IdComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			if(emp1.id==emp2.id) {
				return 0;
				}else if (emp1.id>emp2.id) {
					return 1;
				}else {
					return -1;
				}
		}	
	}
	
	static class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			
			return emp1.name.compareTo(emp2.name);
		}	
	}
	
	static class SalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			if(emp1.salary == emp2.salary) {
				return 0;
			} else if (emp1.salary > emp2.salary) {
				return 1;
			} else
			return -1;
		}	
	}
}
