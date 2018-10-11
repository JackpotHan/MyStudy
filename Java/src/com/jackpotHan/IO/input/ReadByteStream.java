package com.jackpotHan.IO.input;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 11:33
 * @Description:
 */
public class ReadByteStream {
    /**
     * 使用字节流读数据
     * @param args
     */
    public static void main(String[] args) {
        // 声明文件输入流对象
        FileInputStream fis = null;
        try {
            // test.txt文件在当前工程目录下事先创建好
            fis = new FileInputStream("./\\Java\\src\\com\\jackpotHan\\IO\\music.txt");

            byte input[] = new byte[2048];
            // 读入到字节数组
            fis.read(input);

            // 字符编码要与读入的文件对应
            String str = new String(input, "UTF-8");

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭输入流
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
