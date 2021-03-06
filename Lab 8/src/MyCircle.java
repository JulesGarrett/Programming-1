public class MyCircle
{
    
    //Define the constant PI.
    public static final double PI = 3.141592; //static variables are initialized outside of a constructor
    
    //The MyCircle class has one property: radius
    //Put a radius in your class
            private double radius;


    //The MyCircle class has methods too.

    //First create a constructor that sets the radius to 0.0.
            public MyCircle(){
            	radius=0.0;
            }

     
    //Make a method that calculates the diameter of a circle. Recall the radius is half of the diameter.
    //This method will take no parameters and return a double.
    //Why no parameters? Because the circle class has a radius built in. All methods in the Circle class have access to it without it being passed
    //as a parameter! Sweet!
            public double diameter(){
            	double d=0.0;
            	d=(2*radius);
            	return(d);
            }


    //Make a method that returns the area of a Circle.
    //This method takes no parameters.  It returns a double.
    //Recall the area of a circle is PI * radius * radius
    //Since our circle has PI and radius as properties, we can use those in our function without passing them in as parameters. Tubular!
            public double area(){
            	double a=0.0;
            	a=(PI*radius*radius);
            	return(a);
            }

    

    //Make a method that returns the circumference of a Circle.
    //This method takes no parameters.  It returns a double.
    //Recall the circumference of a circle is 2 * PI * radius
    //Since our circle has PI and radius as properties, we can use those in our function without passing them in as parameters. Radical!
            public double circumference(){
            	double c=0.0;
            	c=(2*radius*PI);
            	return(c);
            }
            public double getRadius(){
            	return radius;
            }
            public void setRadius(double r){
            	radius=r;
            }

        
    
}