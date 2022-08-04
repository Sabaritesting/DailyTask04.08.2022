package Task7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a=sc.nextInt();
System.out.println("Enter the number of sides");
double x=sc.nextDouble();
System.out.println("The area of pentagon is"+pentagon_area(a,x));
	}

	private static double pentagon_area(int a, double x) {
		// TODO Auto-generated method stub
		return (a*x*x)/(4*Math.tan(Math.PI/a));
	}

}
