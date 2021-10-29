/**
int VAR1=10;
float VAR2=20.65f;
}
class Myclass implements FirstInterface
{
public int addMethod(int a, int b)
{
return(a+b);
}
public float divMethod(int i, int j)
{
return(i/j);
}
public void display()
{
System.out.println("Variable 1:"+VAR1);
System.out.println("Variable 2:"+VAR2);
}
public static void  main(String args[])
{
Myclass m = new Myclass();
m.addMethod(10,20);
m.divMethod(9,3);
m.display();
}
}
**/

/**
interface IntDemo{
void display();
}
class classone implements IntDemo{
void add(int x,int y){
System.out.println("The sum is: "+(x+y));
}
public void display(){
System.out.println("Welcome to interface");
}
}
**/

class classTwo implements IntDemo{
void multiply(int i,int j, int k) {
System.out.println("The result:" +(i*j*k) );
}
public void display(){
System.out.println("Welcome to Java ");
}
}
class DemoClass{
public static void main(String args[]){
classOne c1= new classOne();
c1.add(10,20);
c1.display();
classTwo c2 = new classTwo();  c2.multiply(5,10,15);
c2.display();
}
}