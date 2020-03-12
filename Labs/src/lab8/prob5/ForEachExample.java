package lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(ForEachExample.createConsumber());
		
		System.out.println("-------------------------------------------");
		// Problem 5A
		list.forEach(s -> System.out.println(s.toUpperCase()));
		
		System.out.println("-------------------------------------------");
		// Problem 5B
		list.forEach(ForEachExample::printUp);
				

		
	}
	
	public static void printUp(String s) {
		System.out.println(s.toUpperCase());
	}
	
	//implement a Consumer
	public static Consumer<String> createConsumber() {
		return new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};
	}

	
}