package lab8.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A. (Employee e) -> e.getName()
		Function<Employee, String> a1 = (Employee e) -> e.getName();
		Function<Employee, String> a2 = Employee::getName;
		//Method reference type: Class::instanceMethod
		
		//B. (Employee e,String s) -> e.setName(s)
		BiConsumer<Employee, String> b1 = (Employee e,String s) -> e.setName(s);
		BiConsumer<Employee, String> b2 = Employee::setName;
		//Method reference type: Class::instanceMethod
		
		//C. (String s1,String s2) -> s1.compareTo(s2)
		BiFunction<String, String, Integer> c1 = (String s1,String s2) -> s1.compareTo(s2);
		BiFunction<String, String, Integer> c2 = String::compareTo;
		//Method reference type: Class::instanceMethod
		
		//D. (Integer x,Integer y) -> Math.pow(x,y)
		BiFunction<Integer, Integer, Double> fd1 = (Integer x,Integer y) -> Math.pow(x,y);
		BiFunction<Integer, Integer, Double> fd2 = Math::pow;
		//Method reference type: Class::staticeMethod
		
		//E. (Apple a) -> a.getWeight()
		Function<Apple, Integer> fe1 = (Apple a) -> a.getWeight();
		Function<Apple, Integer> fe2 = Apple::getWeight;
		//Method reference type: Class::instanceMethod
		
		//F. (String x) -> Integer.parseInt(x);
		Function<String, Integer> f1 = (String x) -> Integer.parseInt(x);
		Function<String, Integer> f2 = Integer::parseInt;
		//Method reference type: Class::staticMethod
		
		//G. EmployeeNameComparator comp = new EmployeeNameComparator();
		//(Employee e1, Employee e2) -> comp.compare(e1,e2)
		EmployeeNameComparator comp = new EmployeeNameComparator();
		BiFunction<Employee, Employee, Integer> g1 = (Employee e1, Employee e2) -> comp.compare(e1,e2);
		BiFunction<Employee, Employee, Integer> g2 = comp::compare;
		//Method reference type: object::instanceMethod
	}

}
