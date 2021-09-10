import java.util.Scanner;

class days_weeks_months_years
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int days = sc.nextInt();
	String day = sc.nextLine();
	int da = Integer.valueOf(day);
	System.out.println("Days to Weeks : "+ da/7);
	System.out.println("Days to Months : "+ da/30);
	System.out.println("Days to Years : "+ da/365);
}
}