package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>x=new ArrayList<String>();
		x.add("Red");
		x.add("Blue");
		x.add("Green");
		x.add("Yellow");
		x.add("Black");
		System.out.println("Before Reversing"+x);
		Collections.reverse(x);
		System.out.println("After Reversing"+x);
	}

}
