package IO.InPutStreamSimple;

import java.io.*;

/**
 * Created by Tan on 16/2/23.
 */
public class InputStreamReaderDemo {

    public static void main(String... args) throws IOException {
        File file = new File("/Users/Tan/JavaDemo/ThinkInJava/src/IO/InPutStreamSimple/test");
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            String line = null;
            int temp = 0;
            int cnt = 0;
            byte[] bytes = new byte[(int) file.length()];
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            while ((temp = bufferedReader.read()) != (-1)) {
                bytes[cnt++] = (byte) temp;
            }
            System.out.println(new String(bytes));
        }


    }
}
