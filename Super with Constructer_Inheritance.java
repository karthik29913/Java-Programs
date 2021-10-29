/**
class A
  {
    int a;
    A()
     {
       a=val+val2;
     }
    A(int val)
     {  this(val,val*2);
	a=val;
     }
  }
class B extends A
  {
    int b;
    B()
     {
        super(val*2);
        b=20;
        System.out.println("In class B Constructer");
	
     }
  }
class C
  {
    public static void main(String args[])
     {  


	B b2=new B(50);
	System.out.println(b2.a +" " +b2.b);
     }
  }
**/

/**
class A
  {
    A(int a)
     {
	System.out.println(a);
     }
A(String str)
{
System.out.println(str)
}  
}
class B extends A
  {
    B(String str)
     {
	super(10);
	System.out.println(str);
     }
  }
class C
  {
    public static void main(String args[])
     {
	B obj=new B("Hello");
     }
  }
**/

/**
//Super with Variables_Inheritance
class A
  {
      int val=0;
  }
class B extends A
  {
      int val=0;
      void set(int val)
         {
	val=val+10;
	this.val=val+20;
	super.val=val*2;
	System.out.println("arg Val is"+val +" B val is "+this.val +" A val is "+super.val);

         }
  }
class C
  {
      public static void main(String args[])
        {
	B obj=new B();
	obj.set(20);
        }
  }
**/

//Super with Method_Inheritance
/* Base class Person */
class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
}
/* Subclass Student */
class Student extends Person
{
    void message()
    {
        System.out.println("This is student class");
    }
  
void display()
    {
        message();
       super.message();
    }
}



                                                                                                                                                                                                                                                                                                           


