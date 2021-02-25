package IO;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("C:\\Develop\\itcast");

        File destFile = new File("C:\\");

        copyFolder(srcFile,destFile);


    }
//复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
//      判断是否是目录
        if (srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }

            File[] fileArray = srcFile.listFiles();

            for (File file : fileArray){
                copyFolder(file,newFolder);
            }
        }else {
            File newfile = new File(destFile,srcFile.getName());

            copyFile(srcFile,newfile);
        }
    }

    //    字节缓冲流复制文件
    public static void copyFile(File srcFile, File destFile)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
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
