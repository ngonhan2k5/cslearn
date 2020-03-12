package lab9.part1.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + salary+"]";
	}
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(new Employee("Joe", 50000));
				add(new Employee("Jim", 75000));
				add(new Employee("Tom", 80000));
				add(new Employee("Jim", 70000));
				add(new Employee("Steve", 55000));
				add(new Employee("Jim", 100000));
				add(new Employee("Joe", 59000));
				add(new Employee("Rich", 88000));
			}
		};
		List<Employee> ls = list.stream()
				.sorted(
							new Comparator<Employee>() {
	
								@Override
								public int compare(Employee o1, Employee o2) {
	
									if (o1.name.equals(o2.name) && o1.salary == o2.salary)
										return 0;
									
									if (o1.name.equals(o2.name)) {
										return o2.salary - o1.salary;
									}else {
										return o1.name.compareTo(o2.name);
									}
								}
							}
						)
				.collect(Collectors.toList());
		//expected output:
		//[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]
		System.out.println(ls);
	}
}

