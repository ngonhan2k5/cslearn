package lab9.part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
	private static MySingletonLazy instance = null;

	private MySingletonLazy() {
		instance = this;
	}

	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElse(new MySingletonLazy());
		
	}
	
	public static void main(String[] args) {
		System.out.println(getInstance());
		System.out.println(getInstance());
	}
}