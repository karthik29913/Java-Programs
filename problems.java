public class problems {
    public static void main(String[] args) {
        char C1 = 'A', C2 = 'E';
        if (C1 >= 'A' && C2 >= 'A') {
            C1 = (char) ((int) C1 + 32);
            C2 = (char) ((int) C2 + 32);
            System.out.println(C1);
            System.out.println(C2);
        }
        if ((int) C1 > (int) C2) {
            System.out.println(C1);
            System.out.println(C2);
        } else {
            System.out.println(C2);
            System.out.println(C1);
        }

        // pb-2
        char c1 = '#';
        if (c1 >= 'a' && c1 <= 'z' || c1 >= 'A' && c1 <= 'Z') {
            System.out.println("ALPHABET");
        } else if (c1 >= '0' && c1 <= '9') {
            System.out.println("DIGIT");
        } else {
            System.out.println("SPECIAL CHARACTER");
        }

        // pb-3
        char c2 = '1';
        if (c2 == 'R' || c2 == 'r') {
            System.out.println("RED");
        } else if (c2 == 'B' || c2 == 'b') {
            System.out.println("BLUE");
        } else if (c2 == 'G' || c2 == 'g') {
            System.out.println("GREEN");
        } else if (c2 == 'O' || c2 == 'o') {
            System.out.println("ORANGE");
        } else if (c2 == 'Y' || c2 == 'y') {
            System.out.println("YELLOW");
        } else if (c2 == 'W' || c2 == 'w') {
            System.out.println("WHITE");
        } else {
            System.out.println("INVALID ENTRY");
        }

        // pb-4
        int x = Integer.parseInt(args[0]);
        switch (x) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("January");
                break;
            case 10:
                System.out.println("January");
                break;
            case 11:
                System.out.println("January");
                break;
            case 12:
                System.out.println("January");
                break;
        }


        // pb - 6
        int x1 = 9, j;
        boolean flag = false;
        if (x1 > 0) {
            for (j = 2; j < x1; j++) {
                if (x1 % j == 0) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }

        int a1, i, c = 0;
        boolean f = false;
        a1 = Integer.parseInt(args[0]);
        for (i = 2; i <= Math.sqrt(a1); i++) {
            if (a1 % i == 0) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        int b1;
        b1 = 4321;
        int rev = 0,res = b1;
        int digit=0;
        while(b1>0){
            digit = b1%10;
            rev = rev*10+digit;
            b1 /= 10;
        }
        if(res == rev){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

        int len = args.length,m=0;
        for(int k = 0 ; k <= len ; k++) {
            m++;
        }
    }
}
