package myJava.learningJava;

public class UseTryCatchDemo {
	public static void main(String[] args){
		String str = null;
		int strLength = 0;
		try{
			strLength = str.length();
		}
		catch(NullPointerException e){
			System.out.println("lenght exception!");
		}
		System.out.println("length: " + strLength);
	}
}
