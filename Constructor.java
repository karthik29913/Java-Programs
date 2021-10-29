class Constructor
{
Constructor()
{
System.out.println("This is a default Constructor");
}
Constructor(int a)
{
System.out.println("Thia is constructor with one argument"+a);
}
}
class Main
{
public static void main(String args[])
{
Constructor c1=new Constructor();
Constructor c2=new Constructor(100);

}
}
