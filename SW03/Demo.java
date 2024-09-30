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
        return temp;
    }

    public int max2(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
