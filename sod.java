int b1, res, sum = 0;
        b1 = Integer.parseInt(args[1]);
        while (b1 > 0) {
            res = b1 % 10;
            sum += res;
            b1 /= 10;
        }
        System.out.println(sum);