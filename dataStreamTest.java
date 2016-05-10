package myJava.learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/*
 * this example shows the value will pass all the intermediate operations until the terminal operation. 
 * And then the next value pass will the intermediate operations.
 * Not all values pass the first intermediate operations and then the second one, no, thats not!
 */

//POJO
class Student{
	private String name = null;
	private int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}

public class dataStreamTest {
	//String[] students = {"zdy", "zay", "whp"};
	List<Student> students = null;

	public dataStreamTest(){}
	
	public List<Student> initStudents(){
		this.students = new ArrayList<Student>();
		this.students.add(new Student("zdy" , 29));
		this.students.add(new Student("zay" , 2));
		this.students.add(new Student("whp" , 31));
		return this.students;
	}
	
	public List<String> display(){
		List<String> ids = this.initStudents()
								.stream()
								.filter(s -> {System.out.println("filters -> " + s.getName()); return s.getAge() > 20;})
								.map(s -> {System.out.println("map -> " + s.getName() ); return s.getName();})
								.collect(Collectors.toList());
		return ids;
	}
	
	public static void main(String[] args){
		new dataStreamTest().display();
	}

}
