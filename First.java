/**
class First
{
 int a=10;
 void disp()
{
  System.out.println("value of a is :"+a);
}
public static void main(String args[])
{ 
  First fob=new First();
  System.out.println(fob.a);
  fob.disp();
}
}
**/

/**
class First
{
 int a=0;
 void update(int value)
{
 a=value;
}
void disp()
{
  System.out.println("value of a is :"+a);
}
public static void main(String args[])
{
First fob=new First();
System.out.println("Initial value is "+fob.a);
fob.update(15);
fob.disp();
}
}
**/

/**
class co3
{
    int id;
    String name;
    int salary;
    void setid(int i)
    {
        id=i;
    }
    void setname(String n)
    {
        name=n;
    }
    void setsal(int s)
    {
        salary = s;
    }
    void getemp()
    {
        System.out.println(name+" salary is "+salary);
    }
    public static void main(String[] agrs)
    {
        co3 obj2 = new co3();
        obj2.setid(80073);
        obj2.setname("karthikeyan");
        obj2.setsal(25000);
        obj2.getemp();
    }
}
**/

/**
class First
{
 int a=100;
 int getValue()
{
return a;
}
public static void main(String args[])
{ 
  First fob=new First();
  System.out.println(fob.getValue());
}
}
**/


class Account
{
double balance;
void addBalance(double value)
{
balance=balance+value;
}
double getBalance()
{
return balance;
}
double withdraw(double amount)
{
 if(balance>(amount+5000))
{
balance=balance-amount;
return balance;
}
else
}
 System.out.println("Insufficient funds")
 return -1;
}
}
public static void main(String args[])
{
Account acc=new Account();
acc.addBalance(6000);
acc.addBalance(acc.getBalance()*2);

System.out.println(acc.getBalance());
}
}
**/




