package question3;

abstract class Shape{
	
	int a = 76 ;
	int b = 87 ;
	
	public abstract void printArea() ;
}

class Rectangle extends Shape{
	

public void printArea() {
		System.out.println("Area of the given Rectangle is " + (a*b));
	}  
}
class Triangle extends Shape{
	

public void printArea() {
		System.out.println("Area of the given Triangle is "+ (a*b)/2 );
	}  
}

class Circle extends Shape{
	
double pi= 22/7;

public void printArea() {
		System.out.println("Area of the given Circle is "+ (pi*a*b));
	}     
}
public class Question3 {

	public static void main(String args[]) {
		
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
	
		rectangle.printArea();
		triangle.printArea();
		circle.printArea();
		
	  
	}
	
}


