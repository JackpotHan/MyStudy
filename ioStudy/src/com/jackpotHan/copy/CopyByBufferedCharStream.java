package com.jackpotHan.copy;

import java.io.*;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 13:38
 * @Description:
 */
public class CopyByBufferedCharStream {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("./\\ioStudy\\src\\com\\jackpotHan\\music.txt");
            FileOutputStream fos = new FileOutputStream("./\\ioStudy\\src\\com\\jackpotHan\\music_copy.txt");

            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");

            BufferedReader br = new BufferedReader(reader);
            // BufferedWriter bw = new BufferedWriter(writer);
            // PrintWriter和BufferedWriter用法类似
            // PrintWriter可以输出换行符
            // 构造方法PrintWriter(Writer out,boolean autoFlush) 里可以设置缓冲区自动输出，这样就不需要手动调用flush方法了。
            PrintWriter pw = new PrintWriter(writer, true);

            String input;
            // BufferedReader可以按行读取
            while ((input = br.readLine()) != null) {
                // bw.write(input); //
                // BufferedWriter的writer方法是带有缓冲区的，此时打印的文本是不带换行符的
                // PrintWriter的println方法支持不同平台的换行符输出
                pw.println(input);
            }

            // bw.flush(); // 强制输出缓冲区内容。如果不加上flush，最后的缓冲区未读满将不输出内容

            // bw.close();
            pw.close();// 按顺序关闭流
            writer.close();
            fos.close();

            br.close();
            reader.close();
            fis.close();

            System.out.println("done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
