package TryCatchFinallyReturn;

/**
 * Created by Tan on 2016-12-11.
 */
public class Test {

    public static void main(String... args) {
        System.out.println(test1());
    }

    public static int test1() {
        int i = 0;
        try {
            i = 0 / 0;
            i = 1;
            return i;
        } catch (Exception e) {
            System.out.println("123123");
            i = 10;
            return i;
        } finally {
            i = i + 1;
            return i;
        }
    }
}
