......................................
Strings
1)
public class LengthExample{  
public static void main(String args[]){  
String s1="javatpoint";  
String s2="python";  
System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
System.out.println("string length is: "+s2.length());//6 is the length of python string  
}}
............
2)
import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
      String strOrig;
      Scanner scan = new Scanner(System.in);
 
      System.out.print("Enter a String : ");
      strOrig = scan.nextLine();
      
      System.out.print("Copying String...\n");
      
      StringBuffer strCopy = new StringBuffer(strOrig);
      
      System.out.print("String Copied Successfully..!!\n");      
      System.out.print("The Copied String is " + strCopy);
   }
}
.....................
3)
class TestStringConcatenation2{  
 public static void main(String args[]){  
   String s=50+30+"Sachin"+40+40;  
   System.out.println(s);//80Sachin4040  
 }  
} 
......................
4)
class Teststringcomparison1{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  
 }  
}
..............................
5)
/* Java Program Example - Convert Lowercase Character to Uppercase */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Lowercase : ");
        ch = scan.next().charAt(0);
		
        temp = (int) ch;
        temp = temp - 32;
        ch = (char) temp;
		
        System.out.print("Equivalent Character in Uppercase = " +ch);
    }
}
...........................
6)
/* Java Program Example - Convert Uppercase Character to Lowercase */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Uppercase : ");
        ch = scan.next().charAt(0);
		
        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;
		
        System.out.print("Equivalent Character in Lowercase = " + ch);
    }
}    
.............................
7)
public class StringFormatter {  
public static String toggle(String str){  
    String words[]=str.split("\\s");  
    String toggle="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
    }  
    return toggle.trim();  
}  
}  
................................
8)
//program to count Alphabets,number,special character and space
import java.util.Scanner;
public class CountAlphabetsNumOthers{
public static void main(String args[]){
//variable declaration
    String str;
int Alphabets=0,num=0,space=0,Special=0;
//vriable declaration and initialization
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
System.out.println("Enter the String  ");
str=scan.nextLine();

for(int i=0; i<str.length(); i++){
char ch=str.charAt(i);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){ //Check Alphabets
    Alphabets++;
}

else if(ch>='0' && ch<='9'){ //Check numeric characters
    num++;
}
else if(ch ==' '){ //check space
    space++;
}
else{   //find the special caracters
    Special++;
}

}
System.out.println("\nAlphabet letters: "+Alphabets);
System.out.println("Number: "+num);
System.out.println("Space: "+space);
System.out.println("Special characters: "+Special);
}
}
.......................................
9)
public class CountVowelConsonant {  
    public static void main(String[] args) {  
          
        //Counter variable to store the count of vowels and consonant  
        int vCount = 0, cCount = 0;  
          
        //Declare a string  
        String str = "This is a really simple sentence";  
          
        //Converting entire string to lower case to reduce the comparisons  
        str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) {  
            //Checks whether a character is a vowel  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                //Increments the vowel counter  
                vCount++;  
            }  
            //Checks whether a character is a consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                //Increments the consonant counter  
                cCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);  
    }  
}
...........................
10)
public class WordCount {  
      static int wordcount(String string)  
        {  
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
      public static void main(String[] args) {  
          String string ="    India Is My Country";  
         System.out.println(wordcount(string) + " words.");   
    }  
}  
Output:

4 words.
..................................
11)
public class Reverse   
{    
    public static void main(String[] args) {    
        String string = "Dream big";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}    
......................................
12)
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
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
.........................................


