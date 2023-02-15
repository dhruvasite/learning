package question2;

abstract class Shape{
	
	abstract void show() ;
	
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


public class Assignment2 {

	public static void main(String args[]) {
		
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		
		circle.show();
		rectangle.show();
		
	     System.out.println();
	
	     circle.getInfo();
	     rectangle.getInfo();
	}
	
}
