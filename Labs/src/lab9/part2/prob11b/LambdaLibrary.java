package lab9.part2.prob11b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
	static Function<List<Employee>, List<String>> func = (lst) -> lst.stream()
			.filter(e -> e.getSalary() > 100000)
			  .filter(e -> e.getLastName().matches("[N-Z]*"))
			  .map(e -> e.getFirstName() + " " + e.getLastName() )
			  .sorted()
			  .collect(Collectors.toList());
}
