/**
class Encapsulation//data hiding
{
private int a=10;
public int b=20;
int sum()
{
return a+b;
}
int geta()
{
return a;
}
void seta(int val)
{
a=val;
}
}
class Main
{
public static void main(String args[])
{
Encapsulation fob=new Encapsulation();
System.out.println(fob.geta());
System.out.println(fob.sum);
}
}
**/
class Point
{
int m_x,m_y;
public Point(int x,int y)
{
m_x=x;
m_y=y;
}
public static void main(String args[])
{
Point p = new Point(10,20);
}
}