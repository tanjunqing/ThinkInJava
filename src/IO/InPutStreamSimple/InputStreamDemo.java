package IO.InPutStreamSimple;

import java.io.*;

/**
 * Created by Tan on 16/2/23.
 */
public class InputStreamDemo {
    public static void main(String... args) {
        File file = new File("/Users/Tan/JavaDemo/ThinkInJava/src/IO/InPutStreamSimple/test");
        byte[] bytes = new byte[(int) file.length()];
        if (file.exists()) {
            try {
                FileInputStream in = new FileInputStream(file);
                int cnt = 0;
                int temp = 0;
                while ((temp = in.read()) != (-1)) {
                    bytes[cnt++] = (byte) temp;
                }
                in.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(bytes));
        } else {
            System.out.println("没有找到文件");
        }

    }
}