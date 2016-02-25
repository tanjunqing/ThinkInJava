package IO.InPutStreamSimple;

import IO.SystemParam;

import java.io.*;

/**
 * Created by TanTB on 2016/2/25.
 */
public class OutputStreamDemo {

    public static void main(String... args) throws IOException {
        File fileFrom = new File(SystemParam.Win_File_Path + "/test.txt");
        File fileTo = new File(SystemParam.Win_File_Path + "/test2.txt");
        FileInputStream fileInputStream = new FileInputStream(fileFrom);
        FileOutputStream fileOutputStream = new FileOutputStream(fileTo);
        int cnt = 0;
        int temp = 0;
        byte[] b = new byte[(int) fileFrom.length()];
        while ((temp = fileInputStream.read()) != -1) {
            b[cnt] = (byte) temp;
            fileOutputStream.write(b[cnt]);
            cnt++;
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }
}
