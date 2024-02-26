package aaa;

import java.util.*;
public abstract class DemoAbstarct {

	public abstract double area();
	
	public void dispaly() {
		System.out.println("this is a shape. ");
	}

}


class Circle extends DemoAbstarct{
	private double r;
	
	public Circle(double radius) {
		this.r=radius;
	}
	 public double area() {
		return Math.PI * r *r ;
		
	}
}
class Abc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double rs=sc.nextDouble();
		Circle c=new Circle(rs);
		System.out.print(c.area());
	}
}

