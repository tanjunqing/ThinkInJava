package IO;

import java.io.UnsupportedEncodingException;

/**
 * Created by Tan on 16/2/23.
 */
public class jfds {

    public static void main(String... args) throws UnsupportedEncodingException {
        String s = "哈哈哈哈";
        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(new String(bytes));
    }
}
