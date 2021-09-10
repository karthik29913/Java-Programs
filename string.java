/**
class string
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
class string 
{
public static void main(String args[])
{
  char[] helloArray = {'h','e','l','l','o','.'};
  String helloString=new String(helloArray);
  System.out.println(helloString);
}
}
**/


/**
class string
 {

   public static void main(String args[])
 {
      String str1 = "Karthikeyan ";
      String str2 = "how are you ";
      System.out.println(str1.concat(str2));
      System.out.println(str2.concat(str1));
      str1=str1.concat(str2);
 }
}
**/

/**
class string
 {
   public static void main(String args[])
 {
      String str1 = "Karthikeyan ";
      String str2 = new String("how are you");
      System.out.println(str1.charAt(1));
      System.out.println(str2.charAt(1));
 }
 }
**/


/**
class string
{    
    public static void main(String[] args)
 {  
    	String s1 = "Hello";
    	String s2 = "Hello";
    	String s3 = new String("Hello");
        String s4 = new String("Hello");
 
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);  //== case
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));   
   }  
}
**/

/**
class string
{    
    public static void main(String[] args)
 {  
    	String s1 = "Hello";
    	String s2 = "Hello";
    	String s3 = new String("Hello");
        String s4 = new String("hello");
 
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));
        System.out.println(s3.compareToIgnoreCase(s4));
 }
}
**/

/**
class string
{    
    public static void main(String[] args)
 {  
    	String s1 = "Hello";
    	String s2 = "Hello";
    	String s3 = new String("Hello");
        String s4 = new String("hello");
 
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("Hello"));
       
 }
}
**/

/**
class string
{    
    public static void main(String[] args)
 {  

    	String s3 = new String("Hello, welcome to JAVA");
 
        System.out.println(s3.indexOf("V"));
        System.out.println(s3.lastIndexOf("V",s3.indexOf('V')+1));
        System.out.println(s3.lastIndexOf("v"));


        System.out.println(s3.indexOf('o',7));
        System.out.println(s3.indexOf("k"));
       
 }
}
**/

/**
class string
 {
   public static void main(String args[])
 {
      String s1 = "Karthikeyan ia a good boy ";
      String replaceString =s1.replace("good","boy");
      System.out.println(replaceString);
 }
 }
**/


  








