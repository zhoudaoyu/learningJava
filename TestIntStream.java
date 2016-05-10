package myJava.learningJava;

import java.util.stream.IntStream;

public class TestIntStream {
	public TestIntStream(){}
	
	public void testIntStream(){
		/*the parameter of forEach is interface IntConsumer
		  So we can use lambda
		  the return value of method accept is void. So we don't need reture value in lambda expressions.
		*/
		IntStream.rangeClosed(1, 5).forEach(value -> System.out.println(value));
	}

	public void testIntStream2(){
		/*the parameter of forEach is interface IntConsumer
		  So we can use lambda
		  the return value of method accept is void. So we don't need reture value in lambda expressions.
		*/
		IntStream.range(1, 5).forEach(value -> System.out.println(value));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestIntStream().testIntStream();
		new TestIntStream().testIntStream2();;
	}

}
