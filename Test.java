class Test
{
public static void main(String args[])
 { 
   
   double f1=987654321.1234567;
   double f2=6.9876543210;
   int a=17,b=017,c=0X17;
   double d1=17;
   char c1='a';
   int d=16;
   int i4 = c1;
   int i5 =(int)f1;
   float f6=(float)f1;
   int i6 = 55555;
   char c2=(char)i6;
   int i7=Integer.parseInt(args[0]);
   int i8=Integer.parseInt(args[1]);
   int A=20;
   int B=5;

   System.out.println("double :" +f1);
   System.out.println("double :" +f2);
   System.out.println(a+","+b+","+c);
   System.out.println("Widening casting int to double :" +d1);
   System.out.println("Widening casting char to int :" +d);
   System.out.println("narrow casting double to int :" +i5); 
   System.out.println("narrow casting double to float :" +f6);
   System.out.println("narrow casting int to char :" +c2);
   System.out.println(a+","+b);
   
 }
}