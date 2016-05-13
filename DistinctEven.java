package myJava.learningJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEven {
	public void distinctPrime(String... numbers){
		List<String> strLst = Arrays.asList(numbers);
		strLst.stream()
			  .map(str -> new Integer(str))
			  .filter(num -> num % 2 == 0)
			  .distinct()
			  .forEach(num -> System.out.println(num))
			  ;
	}
	
	public static void main(String[] args){
		new DistinctEven().distinctPrime("2", "3", "4", "5");
	}
}
