import java.util.ArrayList;

/**
 * Created by admin228 on 25.01.2016.
 */
public class TestPr {

    final static int N = 50;
    private static ArrayList<Integer> alist = new ArrayList<Integer>();

    public static void main(String args[]) {
        for (int i = 0; i < N; i++) {
            alist.add(i);
        }
        for (Integer x: alist)
            System.out.println(x);

        System.out.println("BOOM!!!");
    }

}
