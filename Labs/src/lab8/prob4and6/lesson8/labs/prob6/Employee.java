package lesson8.labs.prob6;

class Employee {
	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;
	}

	// instance methods
	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		this.name = s;
	}

	//from Employee
	public double getSalary() {
		return salary;
	}


	// instance fields
	private String name;
	private double salary;

}