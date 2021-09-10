/**import java.util.Scanner;
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
**/
class inputs_1
  {
     public static void main(String args[])
      {
       System.out.println("enter pass code: ");
	char[] name=System.console().readPassword();
	System.out.println(name);
      }
  }
/**
import java.util.Scanner;
class inputs_1{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int i, Number;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Number = sc.nextInt();	
		
		int [] Array = new int[Number];
		
		System.out.print(" Please Enter " + Number + " elements of an Array  : ");
		for (i = 0; i < Number; i++)
		{
			Array[i] = sc.nextInt();
		}     

		for (i = 0; i < Number; i++)
		{
			System.out.print(Array[i] + "\t");
		}
	}
}
**/
/**
Scanner input = new Scanner(System.in);
        System.out.println("enter student name: ");
        String name = input.nextLine();
        System.out.println("enter registration number: ");
        double ID = input.nextDouble();
        System.out.println("enter subject 1 marks");
        int s1 = input.nextInt();
        System.out.println("enter subject 2 marks");
        int s2 = input.nextInt();
        System.out.println("enter subject 3 marks");
        int s3 = input.nextInt();
        System.out.println("enter subject 4 marks");
        int s4 = input.nextInt();
        System.out.println("enter subject 5 marks");
        int s5 = input.nextInt();
        int sum = s1 + s2 + s3 + s4 + s5;
        float avg = (sum / 5);
        System.out.println(name);
        System.out.println(ID);
        System.out.println(sum);
        System.out.println(avg);
**/

