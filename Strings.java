import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Strings {
    public static void main(String[] args) {
        //1
        /**String name = "hello";
         System.out.println(name);**/

        //2 type of initializing the string through char array
        /**char[] ch = {'h', 'e', 'l', 'l', 'o'};
         String hello = new String(ch);
         System.out.println(hello);**/

        /**String s1 = new String("hello");
         System.out.println(s1);**/

        // finding the length of the string and concatenation
        /**String s = "Hello world it is routine everyday";
         String s1 = "hi how are you";
         System.out.println(s.length());
         System.out.println(s.concat(s1));// we can also use + operator
         // to access the string we use charAt
         System.out.println(s.charAt(7));
         // to compare to strings
         System.out.println(s.equals(s1));
         // equalsIgnoreCase
         System.out.println(s.equalsIgnoreCase(s1));
         String s3 = new String("hello");
         String s4 = new String("hello");
         System.out.println(s == s1);
         System.out.println(s.equals(s1));
         System.out.println(s3 == s4); // while we using the object calling of string for the double equals even though the two strings are same it won't show the correct result
         System.out.println(s3.equals(s4));
         System.out.println(s1.compareTo(s)); // based on ascii values
         System.out.println(s.startsWith("h")); // tells whether the string is starting with the given character or not
         System.out.println(s.indexOf("e", 2)); // prints the index of the character in the string
         System.out.println(s.indexOf('o', s.indexOf('o')+1));
         System.out.println(s.lastIndexOf('o'));**/

        //no of vowels in a given string
        /**Scanner input = new Scanner(System.in);
         String s = input.nextLine();
         int flag = 0;
         int j = s.length() - 1;
         for (int i = 0 ; i < s.length() ; i ++){
         if(s.charAt(i) == s.charAt(j--)){
         flag = 1;
         }
         }
         if(flag == 1){
         System.out.println("palindrome");
         }
         else{
         System.out.println("not a palindrome");
         }**/
        // 2
        /**String s1 = "abcdefghijklmnopqrstuvwxyz";
         System.out.println(s.compareTo(s1));**/

        /**int sum = 0, i = 0;
         for (i = i; i < s.length(); i ++){
         if(s.charAt(i) == ' '){
         sum = 0;
         continue;
         }
         else{
         sum += (int)s.charAt(i);
         }
         System.out.println(sum);
         }**/

        /**String s = new String("hi"); // here s is a object for the class string
         System.out.println(s);**/
        Scanner input = new Scanner(System.in);
        /**String s1 = input.nextLine();
         int index = input.nextInt();
         System.out.println(s1.charAt(index));**/
        /**String s = new String("This is earth");
         String s1 = new String("This is earth");
         if(s.compareTo(s1) > 0){
         System.out.println(s + "is greater than" + s1);
         }
         else{
         System.out.println(s+' '+"is less than" +' '+s1);+35
         }**/
        String s = new String("CatDogs");
        String s1 = new String("hello WORld");
        /**if(s.equalsIgnoreCase(s1)){
            System.out.println(s + ' ' + "equal to" + ' ' + s1);
         }
         else{
            System.out.println(s + ' ' + "not equal to" + ' ' + s1);
         }
         System.out.println(s.concat(s1));**/
        String s2 = new String("and");
        //System.out.println(s1.contains(s2));
        /**int count = 0;
         for(int i = 0; i < s.length(); i ++){
         if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            count ++;
            }
         }
         System.out.println(count);**/

       /** if (s.length() % 2 == 0) {
            for (int i = 0; i < (s.length() / 2); i++) {
                System.out.println(s.charAt(i));
            }
        }9
        else {
            for (int i = (s.length() / 2) + 1; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        }**/
       int pos = 5;
       System.out.println(s1.substring(0,pos) + s + s1.substring(pos+1, s1.length()));
    }
}
