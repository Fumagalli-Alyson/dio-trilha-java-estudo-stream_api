package predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");
		
		palavras.stream().filter(str -> str.length() > 5).forEach(System.out::println);

	}

}
