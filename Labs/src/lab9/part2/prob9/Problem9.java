package lab9.part2.prob9;

import java.util.stream.IntStream;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem9.printSquares(4);
	}
	
	public static void printSquares(int num) {
		IntStream.iterate(1, i -> Problem9.nextSquare(i))
			.limit(num)
			.forEach(System.out::println);
	}
	
	public static int nextSquare(int i) {
		int j = i;
		while (true) {
			j++;
			double sq = Math.sqrt(j); 

			if ((sq - Math.floor(sq)) == 0)
				return j;
		}
	}
	
	


}
