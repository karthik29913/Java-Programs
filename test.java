public class test {
    public static void main(String[] args){
        byte b = -128;  // byte range -128 to 127 so for 128 it show error
        System.out.println(b);

        double f = 1.2;
        boolean c = true;  // boolean must be true or false not integer or float or string
        System.out.println(f);
        System.out.println(c);

        float x = 1;
        float y =  1.3f; // we need to specify that we are going to convert double into float by typing f at the end otherwise it show error
        // by default it takes double value
        float z = 1.23345f;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        float d = 984838486.83738493f; // float rounds the number of digits upto 7 digits
        float v = 12.343345345f;
        System.out.println(d);
        System.out.println(v);

        int a = 10, n= 012, g = 0X3A;   // a = int , n = octal , g = hex
        System.out.println(a+","+n+","+g);

        // type casting
        // widening casting(automatic) - converting a smaller data type to bigger data type
        // narrowing casting(manually) - converting a larger data type to smaller data type by using methods or types

        // widening casting
        float a1 = 14.0f;
        double d1 = a1;
        System.out.println(d1);

        char c1 =  'a';
        int a2 = c1;
        System.out.println(a2);

        // narrow casting
        double d2 = 1.323236565161;
        System.out.println((int) d2);

        int a3 = 655;
        System.out.println((char) a3);


        // parsing - converting from text data to other primitive data types
        // syntax - integer.parseInt('string') (only to convert into int)
        // command line arguments are always strings

        int i1 = Integer.parseInt(args[0]);
        float i2 = Float.parseFloat(args[1]);
        float c3 = (i1 / i2);// for a division to work we need either numerator or denominator to be float otherwise it will show zero
        System.out.println(i1 + i2);
        System.out.println(i1 + i2 + args[2]);
        System.out.println(c3);

        System.out.println(a + a1);
        System.out.println(a - a1);
        System.out.println(a * a1);
        System.out.println(a / a1);

        //unary operators - ++ ,--
        int a4 = 10;
        System.out.println(a4);
        int b3 = ++a4;
        System.out.println(b3);
        int c2 = a4++;
        System.out.println(c2);

        // relational operators
        System.out.println(a3==a4);
        System.out.println(a3!=a4);
        System.out.println(a3<a4);
        System.out.println(a3>a4);
        System.out.println(a3>=a4);
        System.out.println(a3<=a4);

        //shift operators
        //<< left shift operator for every operation it multiply the number by 2
        //>> right shift operator for every operation it divide the number by 2
        int x1 = 7;
        int x2 = 9;
        System.out.println(x1 >> x2);
        System.out.println(x1 << x2);

        //bitwise operators
        System.out.println(x1 & x2);
        System.out.println(x1 | x2);


        //control statements
        //selection statements - if,else  if,else if,else  switch case
        int y1 = Integer.parseInt(args[0]);
        if(y1 % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        char C1 = 'A',C2 = 'E';
        if (C1 >= 'A' && C1 <= 'Z') {
            C1 = (char) ((int) C1 + 32);
            C2 = (char) ((int) C2 + 32);
        }
        if ((int) C1 > (int) C2) {
            System.out.println(C1);
            System.out.println(C2);
        } else {
            System.out.println(C2);
            System.out.println(C1);
            }
        }
    }