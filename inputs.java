import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class inputs {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        /**System.out.println("write your name: ");
        String name = input.readLine();
        System.out.println("write a number: ");
        int num = Integer.parseInt(input.readLine());
        System.out.println(name);
        System.out.println(num);**/

        //1
        System.out.println("Enter today's temperature: ");
        float temp = Float.parseFloat(input.readLine());
        System.out.println(temp);
    }
}