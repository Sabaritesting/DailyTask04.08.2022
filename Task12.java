package Task7;

import java.util.ArrayList;
import java.util.List;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>x=new ArrayList<String>();
x.add("Red");
x.add("Blue");
x.add("Green");
x.add("Yellow");
x.add("Black");
System.out.println("Original ArrayList"+x);
System.out.println("Reduced arraylist");
((ArrayList<String>) x).trimToSize();
System.out.println(x);
	}

}
