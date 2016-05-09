package myJava;

public class ArrayDemo {
	// 引用对象？
	public void addArrayValue(int[] num, int start){
		for(int i = 0; i < num.length; i++, start++){
			num[i] = start;
		}		
	}
	
	public void printArrayValue(int[] num){
		for(int i = 0; i < num.length; i++){
			System.out.println(num[i]);
		}		
	}
	
	public static void main(String[] args){
		final int size = 5;
		int[] str1 = new int[size];
		ArrayDemo ad = new ArrayDemo();
		ad.addArrayValue(str1, 0);
		ad.printArrayValue(str1);
	}
}
