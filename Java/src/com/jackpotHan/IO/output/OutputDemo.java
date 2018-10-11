package com.jackpotHan.IO.output;

import java.io.*;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 10:39
 * @Description:
 */
public class OutputDemo {


    /**
     * Notice :
     * output ---> write
     * 输出就是将数据从程序写到文件中
     *
     * @param args
     */

    public static void main(String[] args) {
        String file = "./\\Java\\src\\com\\jackpotHan\\IO\\music.txt";
//        String info = "\nMy Love!!";
//        appendInfoToFile(file, info);
//        clearInfoForFile(file);
        System.out.println(readInfoFromFile(file));
    }

    /**
     * 在已有的文件后面追加信息
     **/
    public static void appendInfoToFile(String fileName, String info) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            info = info + System.getProperty("line.separator");
            fileWriter.write(info);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 清空已有的文件内容，以便下次重新写入新的内容
     **/
    public static void clearInfoForFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取文件内容，文件中的内容为String
     **/
    public static StringBuilder readInfoFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            return null;
        }
        StringBuilder resultStr = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str;
            while (null != (str = bufferedReader.readLine())) {
                resultStr.append(str);
                resultStr.append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultStr;
    }

    /**
     * @Author: hanjt
     * @Date: 2018/10/10 11:48
     * @Description:
     */
    public static class WriteByteStream {

        /**
         * 使用字节流写数据
         * @param args
         */
        public static void main(String[] args) {

            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("./\\ioStudy\\src\\com\\jackpotHan\\test.txt");

                String str = "1234567";
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
}
