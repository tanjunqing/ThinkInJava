package IO.WriteSimple;

import IO.SystemParam;

import java.io.*;

/**
 * Created by Tan on 16/2/24.
 */
public class FileReadDemo {
    public static void main(String... args) throws IOException {
        File file = new File(SystemParam.Mac_File_Path + "/test.txt");
        File fileTo = new File(SystemParam.Mac_File_Path + "/test3.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bf = new BufferedReader(inputStreamReader);
        boolean fileFlag = false;
        if (fileTo.length() == 0) {
            fileFlag = true;
        }
        String l = null;
        StringBuffer bs = new StringBuffer();
        FileWriter fileWriter = new FileWriter(fileTo, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        byte[] b = new byte[(int) file.length()];
        int cnt = 0;
        int temp = 0;
//        while ((temp = bf.read()) != (-1)) {
////            b[cnt++] = (byte) temp;
//        }
        while ((l = bf.readLine()) != null) {
            bs.append(l);
            bw.write(l);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println(new String(bs));
    }
}
