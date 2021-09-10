/**
class string1
{
public static void main(String args[])
{
  String str1="Hello world";
  String str2=new String("Hello Again");//for string directly
  char[] ch = {'h','e','l','l','o','.'};//for char
  String str3=new String(ch); 
  System.out.println(str1.length());//for length
  System.out.println(str2.length());
  System.out.println(str3.length());
}
}
**/

/**
class string1
{  
 public static void main(String args[])
{  
  int r,sum=0,temp;    
  int n=12;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}

**/

/**
class string1
{  
 public static void main(String args[])
{ 
   int a[] = new int[26];
    for(int i=0;i<26;i++)
 {
      a[i]=0;
    }
    for(int i=0;i<s2.length();i++)
 {
      char ch = s2.charAt(i);
      if (ch>='a' && ch<='z')
 {
        a[ch-'a']=1;
        //System.out.println(ch-'a'+1);
      }
        else if(ch>='A' && ch<='Z')
 {
        a[ch-'A']=1;
        //System.out.println(ch-'A'+1);
      }
    }
    for(int i=0;i<a.length;i++) 
{
      System.out.print(a[i]+",");
    }
}
}

/**


import java.util.Scanner;
class string1
{
  public static void main(String ar[]) {
    String str;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    String words[]=str.split(" ");
                
    int count=0;
    for(int i=0;i<words.length;i++)
    {  if(words[i].equals("") || words[i].equals(" "))
          {                      
            continue; 
          }
       else {                  
              for(int j=i+1;j<words.length;j++)
              {
                if(words[i].equals(words[j]))
                 { 
                   count=1;
                   words[j]=" ";
                   break;
                 }
              }
              if(count==0)
              {
               System.out.print(words[i]+" \n");
              }
              count=0;     
            }
    }
  }
}


