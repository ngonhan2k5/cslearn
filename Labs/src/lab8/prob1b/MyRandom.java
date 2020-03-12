package lab8.prob1b;

import java.util.function.Supplier;

public class MyRandom{
	
	
	public static void main(String[] args) {
		
		//i & ii Math::random to lambda
		Supplier<Double> rand = () -> Math.random();
		System.out.println(rand.get());
		
		// iii.
		Supplier<Double> rand2 = new Supplier<Double>() {

			@Override
			public Double get() {
				
				return Math.random();
			}
		};
		System.out.println(rand2.get());
	}

	
}
