/**
class Tester
{
public static void recursivePrint(int num){
System.out.println("Number:"+num);
if(num ==0) return;
else
recursivePrint(++num);
}
public static void main(String[] args){
Tester.recursivePrint(1);
}
}
**/

/**
import java.io.*;
class Main
{
public static void main(String args[])
{
FileInputStream fx = new FileInputStream("A1.txt");
}
}
**/


class Demo
{
public static void main(String args[])
{
try{

int x=0;
int y=50/x;
System.out.println("y ="+y);
}
catch (ArithmeticException e){
System.out.println("Division by zero.");
}
System.out.println("After catch statement");
}
}


/**
class Ex1
{
public static void main(String xyz[])
{
for(int i=0;i<=xyz.length;i++)
{
try{
System.out.println(xyz[i]);
}catch(ArrayIndexOutOfBoundsException ar)
{
System.out.println("after rectify of exception");
}
}
System.out.println("thank you");
}
}
**/

/**
//Multiple 

class Ex1
{
public static void main(String args[])
{
try{

int x=100;
int y=0;
System.out.println(args[1]);
int z=x/y;
}catch(Exception e)
{
System.out.println("Oops");
}
}
}
**/






