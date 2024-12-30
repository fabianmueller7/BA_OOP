package numbers_handling;

import java.text.DecimalFormat;

public class Datatype_handling {

    Datatype_handling() {}

     public float roundFloat(float number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Float.valueOf(df.format(number));
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        int max = this.max(a,b);
        return this.max(max,c);
    }

    public int max2(int a, int b, int c) {

        if (a >= b && a > c) {
            return a;
        } else if (b >= c) {
            return b;
        }
        return c;
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

