import java.util.ArrayList;

public class TestPr {

    final static int N = 50;
    private static ArrayList<Integer> alist = new ArrayList<Integer>();

    private int k;

    public void setK(int k) {
        this.k = k;
    }

    public void setP(int p) {
        this.p = p;
    }

    public TestPr(int k, int p, int t) {
        this.k = k;
        this.p = p;
        this.t = t;
    }

    public int mult() {
        return this.k * this.p * this.t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getK() {
        return k;
    }

    public int getP() {
        return p;
    }

    public int getT() {
        return t;
    }

    private int p;
    private int t;

    public void left() {
        for (int i = 0; i < N; i++) {
            alist.add(i);
        }
    }

    public void right() {
        for (int i = 0; i < N; i++) {
            alist.add(i);
        }
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        else return gcd(b, a%b);
    }

    public void resolve() {
        k = gcd(p, t);
    }


    public static void main(String args[]) {

        TestPr tp = new TestPr(0,0,0);

        tp.left();
        tp.right();
        tp.resolve();

        for (int i = 0; i < N; i++) {
            alist.add(i);
        }

        for (int i = 0; i < N; i++) {
            alist.add(i);
        }

        for (Integer x: alist)
            System.out.println(x);

        System.out.println("BOOM!!!");
    }

}
