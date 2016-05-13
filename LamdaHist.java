package myJava.learningJava;

class myThread implements Runnable{

	private String name = null;
	
	public myThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name);
	}
	
}

public class LamdaHist {
	public static void main(String[] args){
		//Normal class
		Runnable r1 = new myThread("Normal class");
		new Thread(r1).start();
		
		
		//inner anonymous class
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("Inner anonymous class");
			}
		};
		
		new Thread(r).start();
		
		//simplified inner anonymous class
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Simplified inner anonymous class");
			}
		}).start();
		
		//lambda
		new Thread(() -> {System.out.println("lambda");}).start();
	}
}