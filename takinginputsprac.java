import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class takinginputsprac {
    public static void main(String[] args) throws IOException{
        /**BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(a + b);

         //2
        System.out.println("enter name: ");
        String name = reader.readLine();
        System.out.println("enter marks in s1: ");
        float s1 = Float.parseFloat(reader.readLine());
        System.out.println("enter marks in s2: ");
        float s2 = Float.parseFloat(reader.readLine());
        System.out.println("enter marks in s3: ");
        float s3 = Float.parseFloat(reader.readLine());
        System.out.println(name);
        float avg = (s1 + s2 + s3) / 3;
        System.out.println(avg);**/

        /**Scanner obj = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = obj.nextLine();
        System.out.println("enter your s1 marks: ");
        float a = obj.nextFloat();
        System.out.println("enter your s2 marks: ");
        float b = obj.nextFloat();
        System.out.println("enter your s3 marks: ");
        float c = obj.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.println(name);
        System.out.println(avg);**/

        /**Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        boolean flag = false;
        int j = 0, a;
        do {
            a = obj.nextInt();
            for(int i = 2; i < Math.sqrt(a); i++){
                if (a % i != 0) {
                    flag = true;
                    break;
                }
            }
            if (flag){
                arr[j++] = a;
            }
        }while (a != -1);
        for(int k : arr){
            System.out.println(k);
        }**/

    }
}
