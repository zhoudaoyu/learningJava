package myJava.learningJava;

import java.util.Objects;
import java.util.function.Consumer;

public class implementConsumer implements Consumer {

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	void andThen(String str) {
        System.out.println(str);
    }

}
