package myJava.learningJava;

public class TestMyFunctionalInterface {
	
	public void execute(MyFunctionalInterface fi){
		fi.acept("Hi");
	}

	public static void main(String[] args) {
		// new TestMyFunctionalInterface().execute(str -> System.out.println("Hi Andy!"));
		// method reference, if the parameter value is different from the defined value. we cant use it.
		new TestMyFunctionalInterface().execute(System.out::println);
	}

}
