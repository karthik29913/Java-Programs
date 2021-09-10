/**

import java.util.Scanner;
class string2
{
public static void main(String args[])
{
  String str1="Assignment";

  char[] ch = {'h','e','l','l','o'};//for char
  String str2=new String(ch); 
  String str3=new String("Through Object"); 
 
  Scanner sc=new Scanner(System.in);
  String str4=sc.nextline();

  System.out.println(str1);//for length
  System.out.println(str2);
  System.out.println(str3);
  System.out.println(str4);
}
}
**/
/**
import java.util.Scanner;
class string2
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str1=sc.nextLine();

  System.out.println("Upper case :"+str1.toUpperCase());
  System.out.println("Lower case :"+str1.toLowerCase());

  System.out.println("Original :"+str1);

}
}
**/
/**
class string2
{
public static void main(String args[])
{
  String str1="Assignment";
  String str2="Assignment";
  String str3=new String("Assignment"); 
  String str4=new String("Assignment"); 
 
  str1=str1+str2;
  str3=str3.concat(str4);
  System.out.println(str3);
  System.out.println(str4);
}
}
**/
/**
import java.util.Scanner;
class string2
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str1=sc.nextLine();
  System.out.println(str1.length());//for length
}
}
**/
/**
import java.util.Scanner;
class string2
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str1=sc.nextLine();
  int len=str1.length();
  System.out.println(str1.charAt(0));
  System.out.println(str1.charAt(len/2));
  System.out.println(str1.charAt(len-1));


}
}
**/

/**
import java.util.Scanner;
class string2
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str1=sc.nextLine();
  int len=str1.length();
  for(int i=0;i<len;i++)
   {
  System.out.println(str1.charAt(i)+".");
   }
}
}
**/

/**
class string2
{
public static void main(String args[])
{
int count_num=0;
    int count_lower=0;
    int count_upper=0;
    for(int i=0;i<sa.length();i++) {
      if(sa.charAt(i)>='0' && sa.charAt(i)<='9')
 {
// for && if left operand is false it not evaluates right operand
        count_num=count_num+1;
      }
      else if(sa.charAt(i)>='a' && sa.charAt(i)<='z') 
{// but for & it evaluates both operands and return true or false at last
        count_lower=count_lower+1;
      }
      else if(sa.charAt(i)>='A' && sa.charAt(i)<='Z')
 {// but && returns false immediately if it is false
        count_upper=count_upper+1;
      }
    }
    System.out.println("num : "+count_num);
    System.out.println("lower : "+count_lower);
    System.out.println("upper : "+count_upper);
}
}
**/

class string2
{
public static void main(String args[])
{
int len=sa.length()/2;
    int flag=0;
    for(int i=0;i<len;i++)
 {
      if(sa.charAt(i)!=sa.charAt(sa.length()-1-i))
 {
        flag=1;
        break;
      }
    }
    if(flag==0)
 {
      System.out.println(sa+" is palindrome");
    }else
 {
      System.out.println(sa+" is not palindrome");
}
}




