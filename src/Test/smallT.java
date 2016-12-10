package Test;

/**
 * Created by Tan on 16/4/23.
 */
public class smallT {
    public static void main(String args[]) {
        smallT s = new smallT();
//        int b = s.get();
        System.out.println(s.get());
//        s.get();
    }

    public int get() {
        int x = 1;
        try {
//            return 1;
            return x ;
        } finally {
//            return 2;
            ++x;
        }
    }
}
