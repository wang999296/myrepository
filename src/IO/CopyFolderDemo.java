package IO;

import java.io.*;

/*
     需求：
           把C:\\itcast这个文件夹复制到模块目录下

     思路：
           1创建数据源目录File对象，路径是C:\\itcast
           2获取数据源目录File对象的名称（itcast）
           3创建目的地目录File对象，路径名是模块名+itcast组成（C:\\Develop\\myrepository\\itcast）
           4判断目的地目录对应的File是否存在，如果不存在，就创建
           5获取数据源目录下的所有文件的File数组
           6遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
               数据源文件：C:\\Develop\\myrepository\\mn.jpg
           7获取数据源文件File对象的名称（mn.jpg）
           8创建目的地文件File对象，路径名是目的地目录+mn.jpg组成（C:\\Develop\\myrepository\\itcast\\mn.jpg）
           9复制文件
               由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件

* */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException{
//        创建数据源目录File对象，路径是C:\\itcast
        File srcFolder = new File("C:\\itcast");

//        获取数据源目录File对象的名称（itcast）
        String srcFolderName = srcFolder.getName();

//        创建目的地目录File对象，路径名是模块名+itcast组成（C:\\Develop\\myrepository\\itcast）
        File destFolder = new File("C:\\Develop\\myrepository", srcFolderName);

//        判断目的地目录对应的File是否存在，如果不存在，就创建
        if (!destFolder.exists()){
            destFolder.mkdir();
        }

//        获取数据源目录下的所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

//        遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
//        数据源文件：C:\\Develop\\myrepository\\mn.jpg
        for (File srcfile : listFiles){
            String srcFilename = srcfile.getName();
            File destFile = new File(destFolder,srcFilename);
            copyFile(srcfile,destFile);
        }
    }

    private static void copyFile(File srcfile, File destFile)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
