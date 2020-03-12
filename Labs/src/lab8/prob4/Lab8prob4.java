package lab8.prob4;

import java.util.Arrays;
import java.util.List;

public class Lab8prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Lab8prob4.countWords(Arrays.asList("toi", "ten", "la"), 't', 'e', 3));
	}
	
	public static int countWords(List<String> words, char c, char d, int len) {
		return
				(int) words.stream()
			.filter(s -> s.length() == len)
			.filter(s->s.contains(c+""))
			.filter(s->s.contains(d+""))
			.count();
	}

}
