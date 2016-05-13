package myJava.learningJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestMyFunctionalInterfact2 {	
	public TestMyFunctionalInterfact2(Consumer<String> c, List<String> lst){
		lst.stream()
		   .forEach(c);
	}

	public static void main(String[] args){
		String[] names = {"zdy", "zay", "whp"};
		List<String> namesLst = Arrays.asList(names);
		new TestMyFunctionalInterfact2(r -> System.out.println("Hello " + r), namesLst);
	}
}
