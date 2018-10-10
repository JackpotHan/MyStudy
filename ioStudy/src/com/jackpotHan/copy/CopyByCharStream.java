package com.jackpotHan.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 13:34
 * @Description:
 */
public class CopyByCharStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./\\ioStudy\\src\\com\\jackpotHan\\music.txt");
            FileOutputStream fos = new FileOutputStream("./\\ioStudy\\src\\com\\jackpotHan\\music_copy.txt");
            // 字符流的使用要传入字节流作为参数
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
            // 每次读取的数据大小
            char input[] = new char[100];
            int l = 0;
            while ((l = reader.read(input)) != -1) {
                // void write(char cbuf[], int off, int len)
                // 文件末尾的长度不一定是100，所以需要设置写入数据长度
                writer.write(input, 0, l);
            }
            // 先关闭字符流
            reader.close();
            // 再关闭字节流
            fis.close();
            writer.close();
            fos.close();

            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
