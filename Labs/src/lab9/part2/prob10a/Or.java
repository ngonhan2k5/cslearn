package lab9.part2.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		
		Or o = new Or();
		System.out.println(o.someSimpleIsTrue(list));

	}
	
	public boolean someSimpleIsTrueOld(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream().
					map(x -> x.flag)
					.reduce(false, (rs, element) -> rs || element);
	}
}
