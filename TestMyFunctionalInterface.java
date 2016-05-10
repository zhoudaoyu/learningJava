package myJava.learningJava;

public class TestMyFunctionalInterface {
	
	public void execute( MyFunctionalInterface fi){
		fi.action("");
	}

	public static void main(String[] args) {
		new TestMyFunctionalInterface().execute(str -> System.out.println("Hi Andy!"));
	}

}
