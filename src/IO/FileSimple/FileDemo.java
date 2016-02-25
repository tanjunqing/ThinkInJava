package IO.FileSimple;

import IO.SystemParam;

import java.io.File;

/**
 * Created by Tan on 16/2/23.
 */
public class FileDemo {

    public static void main(String... args) {
        String filePath = SystemParam.Win_File_Path;
        File file = new File(filePath);
        String[] list = file.list();
        //判断是否为文件目录
        if (file.isDirectory()) {
            System.out.println("是文件目录");
        }
        //测试此抽象路径名表示的文件或目录是否存在。
        if (file.exists()) {
            System.out.println("文件目录存在");
        }
        //判断抽象路径是否为文件
        if (file.isFile()) {
            System.out.println("是标准文件");
        } else {
            System.out.println("是文件目录");
        }
        //判断抽象路径是否为目录
        if (file.isDirectory()) {
            System.out.println("抽象目录为目录");
        } else {
            System.out.println("抽象目录是文件");
        }
        System.out.println("将抽象路径名称转换为一个路径字符串:" + file.getPath());
        //如果此文件没有制定的父目录则为 null
        System.out.println("将抽象路径名的父目录转换成一个路径字符串" + file.getParent());
        //获取抽象路径的父目录文件
        File parentFile = file.getParentFile();
        for (String parentFileName : parentFile.list()) {
            System.out.println(parentFileName);
        }
        File[] ff = parentFile.listFiles();
        for (File file1 : ff) {
            ff(file1);
        }
        for (String fileName : list) {
            System.out.println(fileName);
        }
    }

    //递归查询目录下得所有文件
    public static void ff(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f1 : files) {
                ff(f1);
            }
        } else {
            System.out.println(file);
        }
    }
}
