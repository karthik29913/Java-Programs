/**
//upcasting
class A
{
void m1()
{
System.out.println("Inside A's m1 method");
}
}
class B extends A
{
void m1()
{
System.out.println("Inside B's m1 method");
}
void disp()
{
System.out.println("Inside Disp Method");
}
}
class Dispatch
{
public static void main(String args[])
{
A a = new A();
B b = new B();
A ref;
ref=a;
ref.m1();
ref=b;
ref.m1();

}
}
**/

/**
//Method Overriding – Dynamic Method Dispatch

class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends A
{
   void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
class C extends B
{
void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
class Dispatch
{
    public static void main(String args[])
    {
       A a = new A();
       B b = new B();
       C c = new C();
       A ref;
       ref = a;
       ref.m1();
       ref = b;
       ref.m1();
       ref=c;
       ref.m1();
       }
 }
**/


/**
class anime{
    void eat(){
        System.out.println("animals eat");
    }
}
class herb extends anime{
    void eat(){
        System.out.println("im herbivores");
    }
}
class omni extends anime{
    void eat(){
        System.out.println("im omnivores");
    }
}
class carni extends anime{
    void eat(){
        System.out.println("im carnivores");
    }
}
class animal {
    public static void main(String[] args){
        anime O = new anime();
        herb h = new herb();
        omni o = new omni();
        carni c = new carni();
        O.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}
**/

/**
class Examination{
    void write(){
        System.out.println("STUDENTS WRITE");
    }
}
class inSem1 extends Examination{
    void write(){
        System.out.println("inSem 1 exam."+"It is for 50 marks");
    }
}
class inSem2 extends Examination{
    void write(){
        System.out.println("inSem 2 exam."+"It is for 50 marks");
    }
}
class SEM extends Examination{
    void write(){
        System.out.println("SEM exam."+"It is for 100 marks");
    }
}
class STUDENTS {
    public static void main(String[] args){
        Examination O = new Examination();
        inSem1 h = new inSem1();
        inSem2 o = new inSem2();
        SEM c = new SEM();
        O.write();
        h.write();
        o.write();
        c.write();
    }
}
**/



































