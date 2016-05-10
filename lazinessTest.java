package myJava.learningJava;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lazinessTest {
	String[] students = {"zdy", "zay", "whp"};
	public lazinessTest(){}
	
	/*
	 *Display the name of students which delays 5 secs.
	 *This example shows the laziness of intermediate operations.
	 *After it finds the terminal operstions(here is collect), it starts to execute the intermediate operations.
	 */
	
	/*
	 * Think of the collection operations created at one place and probably never used in the entire program. 
	 * Java 8 Streams do not process the collection operations until user actually starts using it.
	 */
	public void displayStudents() throws InterruptedException{
		Stream<String> streamOfNames = Arrays
									   .stream(students)
									   .map(student -> {
										   System.out.println("In Map - " + student.toString());
										   return student.toString();
									   	});
		
		for(int i = 1 ; i <= 5; i++){
			Thread.sleep(1000);
			System.out.println(i + "sec");
		}
		
		streamOfNames.collect(Collectors.toList());
	}
	
	public static void main(String[] args) throws InterruptedException{
		new lazinessTest().displayStudents();
	}

}
