package com.jackpotHan.IO.input;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 13:22
 * @Description:
 */
public class ReadByBufferedByteStream {

    /**
     * 使用带缓冲的字节流读写数据
     *   Notice:
     *      使用字节流可以读取大文件，不如MP4格式文件
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./\\Java\\src\\com\\jackpotHan\\IO\\music.txt");
            // 缓冲区大小100字节
            BufferedInputStream bis = new BufferedInputStream(fis, 100);
            FileOutputStream fos = new FileOutputStream("./\\Java\\src\\com\\jackpotHan\\IO\\music_copy.txt");
            // 缓冲区大小100字节
            BufferedOutputStream bos = new BufferedOutputStream(fos, 100);
            //大型文件对应的数组可以大一些，小文件对应的数组小一些
            // 每次读写字节大写
            byte input[] = new byte[100];
            int count = 0;
            // 开始计时
            long before = System.currentTimeMillis();
            while (bis.read(input) != -1) {
                bos.write(input);
                count++;
            }
            bos.flush();
            bis.close();
            fis.close();
            bos.close();
            fos.close();
            // 总时长
            System.out.println(System.currentTimeMillis() - before + "ms");
            System.out.println("读取了：" + count + "次");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
