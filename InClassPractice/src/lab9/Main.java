package lab9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("mot", "hai", "ba", null);
		
		
		int X[];
		int Y[] = {};
		int Z[] = {1,2,3};
		
//		X[9] = 1;
//		Y[9] = 1;
//		Z[9] = 1;
		
		ls.stream()
			.filter(x -> x!=null)
			.map(x->x).forEach(System.out::print);
		
		
		Stream strings = Stream.of("mot", "hai", "ba");
		strings.reduce(arg0, arg1, arg2);

	}

}
