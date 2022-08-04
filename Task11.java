package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>x=new ArrayList<String>();
x.add("Red");
x.add("Blue");
x.add("Green");
x.add("Yellow");
x.add("Black");
x.add("White");
System.out.println("Before Shuffle"+x);
Collections.shuffle(x);
System.out.println("After Shuffling"+x);
	}

}
