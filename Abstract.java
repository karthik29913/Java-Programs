/**
abstract class First
{
abstract void disp();
void disp1()
{
System.out.println("In disp of first");
}

}
class Second extends First
{
void disp()
{
System.out.println("In second class");
}
}
class Main
{
public static void main(String args[])
{	
Second obj=new Second();
obj.disp();
obj.disp1();
}
}
//In second class
//In disp of first
**/

/**
class GBase{
public final void display(String s);
}
System.out.println(s);
}
}
class Sample extends GBase{
public void display(String s)
{
System.out.println(s);
}

public static void main(String args[]){
Sample ob = new Sample();
od.display("Try Me");
}
}
**/


/** 
abstract class Figure 
{ 
    double dimension1; 
    double dimension2; 
    Figure(double x, double y) 
    { 
        dimension1 = x; 
        dimension2 = y; 
    } 
    abstract double area(); 
} 
 
class Rectangle extends Figure 
{ 
    Rectangle(double x, double y) 
    { 
        super(x,y); 
    } 
    double area() 
    { 
        System.out.println("Rectangle Class -->"); 
        return dimension1*dimension2; 
    } 
} 
 
class Triangle extends Figure 
{ 
    Triangle(double x, double y) 
    { 
        super(x,y); 
    } 
 
    double area() 
    { 
        System.out.println("Triangle class -->"); 
        return dimension1 * dimension2 /2; 
    } 
} 
 
class FindArea 
{ 
    public static void main(String[] args) { 
        Figure fig; 
        Rectangle f = new Rectangle(9, 5); 
        Rectangle t = new Rectangle(10, 8); 
        fig = f; 
        System.out.println("Area of rectangle is : "+fig.area()); 
        fig = t; 
        System.out.println("Area of triangle is : "+fig.area()); 
    } 
} 
 
 
abstract class First 
{ 
    abstract void disp(); 
    void disp1() 
    { 
        System.out.println("In disp1 of first"); 
    } 
} 
 
class Second extends First 
{ 
    void disp() 
    { 
        System.out.println("In Second class"); 
    } 
} 
**/

 

