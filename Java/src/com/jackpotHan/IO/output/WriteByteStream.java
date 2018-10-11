package com.jackpotHan.IO.output;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 11:57
 * @Description:
 */
public class WriteByteStream {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./\\ioStudy\\src\\com\\jackpotHan\\test.txt");

            String str = "JackpotHan's Test";
            // 读入字节数组，并指定编码方式
            byte[] outStr = str.getBytes("UTF-8");
            // 使用文件输出流写出到文件
            fos.write(outStr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
