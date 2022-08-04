package Task7;

import java.util.ArrayList;
import java.util.List;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>x=new ArrayList<String>();
		x.add("Blue");
		x.add("Red");
		x.add("Green");
		x.add("Yellow");
		x.add("Black");
		System.out.println("List1"+x);
		List<String>z=new ArrayList<String>();
		z.add("Grey");
		z.add("White");
		System.out.println("List2"+z);
		List<String>a=new ArrayList<String>();
		a.addAll(x);
		a.addAll(z);
		System.out.println(a);
	}

}
