package IO.WriteSimple;

import IO.SystemParam;
import com.google.common.primitives.Chars;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Tan on 16/2/24.
 */
public class FileReadDemo {
    public static void main(String... args) throws IOException {
        File file = new File(SystemParam.Win_File_Path + "/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bf = new BufferedReader(inputStreamReader);
        File fileTo = new File(SystemParam.Win_File_Path + "/test3.txt");
        String l = null;
        StringBuffer bs = new StringBuffer();
        FileWriter fileWriter = new FileWriter(fileTo, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
//        byte[] b = new byte[(int) file.length()];
//        int cnt = 0;
//        int temp = 0;
//        while ((temp = bf.read()) != (-1)) {
//            b[cnt++] = (byte) temp;
//        }
//        while ((temp = bf.read()) != (-1)) {
//            String hexString = Integer.toHexString(temp);
//            hexString.substring(hexString.length() - 2);
//            bs.append(hexString);
//        }
        int i = 0;
        while ((l = bf.readLine()) != null) {
            bs.append(l);
            if (i == 0) {
                bw.newLine();
                bw.write(l);
            } else {
                bw.write(l);
                bw.newLine();
            }
            i++;
        }
        bw.flush();
        bw.close();
        System.out.println(new String(bs));
//        System.out.println(new String(b));
    }
}
