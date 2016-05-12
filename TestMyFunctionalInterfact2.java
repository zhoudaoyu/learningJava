package myJava.learningJava;

import java.util.Arrays;
import java.util.function.Consumer;

public class TestMyFunctionalInterfact2 {	
	public TestMyFunctionalInterfact2(Consumer<String> c){
		c.accept("Hi");
	}

	public static void main(String[] args){
		String[] names = {"zdy", "zay", "whp"};

			new TestMyFunctionalInterfact2(Arrays.stream(names). name -> System.out.println("Hello Andy!"));

		new TestMyFunctionalInterfact2(System.out::println);
	}
}
