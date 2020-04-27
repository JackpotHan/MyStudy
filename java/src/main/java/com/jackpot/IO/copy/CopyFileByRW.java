package main.java.jackpot.IO.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @Author: hanjt
 * @Date: 2018/10/10 13:30
 * @Description:
 */
public class CopyFileByRW {

    /**
     * FileReader 和 FileWriter
     * @param args
     */
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader("./\\Java\\src\\com\\jackpotHan\\IO\\music.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("./\\Java\\src\\com\\jackpotHan\\IO\\music_copy.txt");
            bw = new BufferedWriter(fw);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }
            bw.flush();
            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
