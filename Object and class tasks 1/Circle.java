import java.lang.ProcessBuilder.Redirect;

import javax.swing.text.MaskFormatter;

public class Circle {
//Requirement :1-Use the preceding class circle to create 3 objects with 1, 1.25, 3 radius and print area and perimeter of each object.
	
//create the Data fields	
	double radius;  // variable [ as long as no + or - so it's not private or public so it's protected/no modifier 
//Then create the constructors	
	public Circle() {   //default constructor - it's role is to initialize the object - and have 2 feature [ it's special so will take the same name of Class , also usual not private of protected , also doesn't take any return type void, int or... ]
	}
	
	public Circle (double r) {  //one argue constructor
		radius = r ;
	}
//Then create the Methods:	
	public double getArea () {
		return radius * radius * Math.PI; 
	}
	
	public double getPerimeter() { 
		return 2*radius*Math.PI;
	}
	
    public void setRadius(double newRadius) { //this method is used to access & changing his value the variable "radius" by the Object in "ObjectAndClassTask-1" class 
    	if(newRadius > 0)
		radius = newRadius;
	}
	
    //Create method to print result :
	public void printCircleData() {
		System.out.println("Circle Radius is :"+radius+"\nCircle Area is :"+getArea()+"\nCircle Perimeter is :"+getPerimeter());
		System.out.println("-------------------");
	}
		
		

	
}
