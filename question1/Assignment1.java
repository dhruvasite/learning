package question1;

class Shape{
	
	public void show() {
		System.out.println("show method of shape class");
	}
	
	public void getInfo() {
		System.out.println(this.getClass().getSuperclass());
	}
}

class Circle extends Shape{
	

	public void show() {
		System.out.println("show method of Circle class");
	}
}

class Rectangle extends Shape{
	

	public void show() {
		System.out.println("show method of Rectangle class");
	}
}


public class Assignment1 {

	public static void main(String args[]) {
		
		Shape shape= new Shape();
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		shape.show();
		circle.show();
       //        rectangle.show();
		
	System.out.println();
	
	     circle.getInfo();
	     rectangle.getInfo();
	}
	
}
