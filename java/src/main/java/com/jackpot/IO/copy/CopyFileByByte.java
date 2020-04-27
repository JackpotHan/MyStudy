package com.jackpot.IO.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 12:07
 * @Description:
 */
public class CopyFileByByte {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("./\\Java\\src\\com\\jackpotHan\\IO\\music.txt");
            fos = new FileOutputStream("./\\Java\\src\\com\\jackpotHan\\IO\\music_copy.txt");
            // 每次读取1024 bytes
            byte input[] = new byte[1024];
            // read返回读入的数据大小，如果没有数据返回-1
            while (fis.read(input) != -1) {
                // 每次写入1024 bytes
                fos.write(input);
            }

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
