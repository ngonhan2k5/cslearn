package lab9.part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prob10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream myIntStream = IntStream.of(10, 2, 2, 3, 4, 5, 7);
		IntSummaryStatistics stat = myIntStream.summaryStatistics();

		System.out.println(stat.getMax());

		System.out.println(stat.getMin());

	}

}
