class Mainclass
{
public static void main(String args[])
{
subclass sc=new subclass();
sc.disp();
}
}
class subclass
{
string msg="Hello ";
void disp()
{
System.out.println(msg);
}
}