package Task7;

import java.util.ArrayList;
import java.util.List;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated 
		List<String>x=new ArrayList<String>();
		x.add("Red");
		x.add("Blue");
		x.add("Green");
		x.add("Yellow");
		x.add("White");
		System.out.println(x);
		if(x.contains("Red")) {
			System.out.println("It is true");
		}
		else {
			System.out.println("It is false");
		}
	}

}
