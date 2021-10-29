/**
class Number
{
int no=20;
int addNo(int no)
{
this.no=this.no+no;
return(no);
}
}
class Main
{
public static void main(String args[])
{
Number n1=new Number();
int res=n1.addNo(10);
System.out.println(res);
}
}
**/

/**
class Sample
{
Sample()
{
System.out.println("Default Constructor");
}
Sample(String str)
{
this();
System.out.println("One argument constructor"+str);
}
Sample(String str,int no)
{
this(str);
System.out.println("Two arguments Constructor"+no);
}
}
class Main
{
public static void main(String args[])
{

Sample a2=new Sample("java",10);
}
}
**/

/**
class Number
{
static int a=1;
void add(int num)
{
a=a+num;
}
}
class Main
{
public static void main(String args[])
{
Number n1=new Number();
n1.add(10);
Number n2=new Number();
n2.add(20);
System.out.println(n1.a);
System.out.println(n2.a);
System.out.println(Number.a);
}
}
**/

