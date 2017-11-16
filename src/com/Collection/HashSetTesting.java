package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTesting {
	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "raju", "10k");
		Employee emp2 = new Employee(20, "ravi", "30k");
		Employee emp3 = new Employee(10, "raju", "10k");

		/*
		 * Set<Employee> set=new LinkedHashSet<>(); set.add(emp1); set.add(emp2);
		 * set.add(emp3); System.out.println(set);
		 */
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		for (Employee employee : list) {
			System.out.println(employee.getEmpName());
		}
		System.out.println(list);

		Set<Employee> set = new TreeSet<>();
		set.addAll(list);
		System.out.println(set);

		/*
		 * Set<Employee> set=new TreeSet<>(); set.add(emp1); set.add(emp2);
		 * set.add(emp3); System.out.println(set);
		 */

	}

}
