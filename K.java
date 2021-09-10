/**
//add
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class K {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());
        System.out.println(num1+num2);
    }
}
**/
import java.util.Scanner;
class scanner 
{
  public static void main(String[] args)
 {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter name:");
    String name = myObj.nextLine();
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
