import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;

public class vector {
    static int a, b;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(), q = cin.nextInt();
        ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> v1 = new ArrayList<>();
            v.add(v1);
        }
        while (q-- > 0) {
            int m = cin.nextInt(), t = cin.nextInt();
            if (m == 0) {
                int x = cin.nextInt();
                v.get(t).add(x);
            } else if (m == 1) {
                ArrayList<Integer> curV = v.get(t);
                if (curV.isEmpty()) ;
                else {
                    for (Object i : curV) System.out.print(i + " ");
                }
                System.out.println();
            } else {
                if (v.size() > t) v.get(t).clear();
            }
        }
    }
}
