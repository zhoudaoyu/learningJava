package myJava.learningJava;

class IllegalScoreException extends Exception {
	public IllegalScoreException(){}
	
	public IllegalScoreException(String msg){
		super(msg);
	}
}

public class DefineMyException{
	public static void main(String[] args){
		try{
			String level = getLevel(70);
			System.out.println(level);
			level = getLevel(110);
			System.out.println(level);
		}catch(IllegalScoreException e){
			e.printStackTrace();
		}
	}
	
	public static String getLevel(int score) throws IllegalScoreException{
		if (score > 100 || score < 0){
			throw new IllegalScoreException("Score should be between 100 and 50!");
		}
		
		int level = score / 10;
		
		switch(level){
		case 10:
			return "Genius";
		case 9:
			return "Great";
		case 8:
			return "Good";
		default:
			return "Not good";
		}
		
	}
}
