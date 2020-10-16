 package main.java.yaksha;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Shape s[] = new Shape[5] ;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++) {
	System.out.println("Enter the type of shape [Rectangle/Triangle/Cube/Sphere]");
	String shape=sc.next();
	if(shape.equals("Rectangle")) {
		Rectangle r=new Rectangle();
		double length=sc.nextDouble();
		double width=sc.nextDouble();
		r.setLength(length);
		r.setWidth(width);
		s[i]=r;

 	}else if(shape.equals("Triangle")) {
 		Triangle t=new Triangle();
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		 t.setBase(base);
		 t.setHeight(height);
		s[i]=t;
		
	}else if(shape.equals("Cube")) {
		Cube c=new Cube();
		double length=sc.nextDouble();
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		 c.setLength(length);
		 c.setWidth(width);
		c.setHeight(height);
		s[i]=c;
		
	}else if(shape.equals("Sphere")) {
		Sphere sp=new Sphere();
		double radius=sc.nextDouble();
		 sp.setRadius(radius);
		s[i]=sp;
	}
	
	}
	for(int i=0;i<5;i++) {
		
		double ar=s[i].area();
		System.out.println("Area :"+ar);
		if(s[i] instanceof Spatial) {
			double vol=s[i].volume();
			System.out.println("Volume :"+vol);
		}
	}
	
	
}
}
