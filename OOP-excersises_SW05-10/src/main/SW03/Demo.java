public class Demo {

    public Demo(){}

    public int max(int a, int b) {

        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b, int c) {

        int temp = this.max(a,b);
        return this.max(temp,c);
    }

    public int max1(int a, int b, int c) {

        int temp = a;

        if (a < b) {
            temp = b;
        }
        if (b < c) {
            temp = c;
        }
        if (a > c) {
            temp = a;
        }
        return temp;
    }

    public int max2(int a, int b, int c) {

        if (a >= b && a > c) {
            return a;
        } else if (b >= c) {
            return b;
        }
        return c;
    }

    public static void outputNumbersFromToFOR(int start, int end) {
        System.out.println("FOR:");
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void outputNumbersFromToWhile(int start, int end) {
        System.out.println("WHILE:");
        int i = start;
        while (i <= end) {
            System.out.println(i++);
        }
    }

    public static void outputNumbersFromToDoWhile(int start, int end) {
        System.out.println("DoWHILE:");
        int i = start;
        do {
            System.out.println(i++);
        }while (i <= end);
    }

    public static void incFloatIncremental(double start, float end, double increment) {
        System.out.println("FloatIncremental:");
        for (int i = 1; start <= end; start += increment, i++) {
            System.out.println(i + " : " + start);
        }
        //Number of increments 4000 : 0.999975000000211
    }

    public static void printBox(final int width, final int height) {
        if(width < 15 && height < 15) {

            for (int i = 0; i <= height; i++) {
                for (int j = 0; j <= width; j++) {

                    if(i%height ==0 || j%width == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }

                    if(j == width) {
                        System.out.println(" ");
                    }
                }
            }

        } else {
            System.out.println("Your Box is too big");
        }
    }

    public static void maxN(int ... args) {
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            int temp = args[i];
            max = Math.max(max,temp);
        }
        System.out.println("Max: " + max);
    }
}
