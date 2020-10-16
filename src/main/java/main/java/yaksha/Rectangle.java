package main.java.yaksha;

public class Rectangle extends Shape{
	private double length;

	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		 /*You code  here*/
		return 0;
	}

	@Override
	public double volume() {
 		return -1;
	}
	
}
