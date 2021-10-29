/**
class div
 {  
    static int divide(int a, int b)
     {
        return a/b;
     }  
   static double add(double a, double b)
     {
        return a/b;
     }  
  }  

class TestOverloading2
 {  
    public static void main(String[] args)
     {  
        System.out.println(div.divide(10,2));  
        System.out.println(div.divide(9,3));  
     }
 }
**/

/**
//METHOD OVERLOADING
class CalculateSquare
 { 
     public void square()    { 
       System.out.println("No Parameter Method Called");
     } 
    public void square( int number )  {
      int square = number * number;
     System.out.println("Method with Integer Argument  	Called:"+square); 
     }
    public void square( double number ) {
       float square = number * number;
       System.out.println("Method with float Argument 	Called:"+square); 
     }
}
class square_overloading
{
public static void main(String[] args)
  {
    CalculateSquare obj = new CalculateSquare();
    obj.square();
    obj.square(5);   
    obj.square(2.5);   
  }
 }
**/


/**
class Divi
 {  
    static double divide(int a, double b)
     {
        return (a/b);
     }  
   static double divide(double a, int b)
     {
        return (a/b);
     }  
  } 
class TestOverloading2
 {  
    public static void main(String[] args)
     {  
        System.out.println(Divi.divide(17,2.0));  
        System.out.println(Divi.divide(10.4,2));  
     }
 }
**/

/**
class Demo{
   void disp(int a, double b){
	System.out.println("Method A");
   }
   void disp(double a, double b){
	System.out.println("Method B");
   }

   public static void main(String args[]){
	Demo obj=new Demo();
	obj.disp(100.0, 20);
	obj.disp(100, 20);
	obj.disp(100, 20.0);
   }
}
**/

class Shapes {
  public void area() {
    System.out.println("The formula for area of ");
  }
}
class Triangle extends Shapes {
  public void area() {
    System.out.println("Triangle is 1/2 * base * height ");
  }
}
class Circle extends Shapes {
  public void area() {
    System.out.println("Circle is 3.14 * radius * radius ");
  }
}
class Main {
  public static void main(String[] args) {
    Shapes myShape = new Shapes();  
    Shapes myTriangle = new Triangle();  
    Shapes myCircle = new Circle(); 
    myShape.area();
    myTriangle.area();
    myShape.area();
    myCircle.area();
  }
}






