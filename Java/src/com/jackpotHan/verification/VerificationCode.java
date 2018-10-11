package com.jackpotHan.verification;

import java.awt.image.BufferedImage;

/**
 * @Author: Hanjt
 * @Date: 2018/7/31 14:15
 * @Description:  滑动验证码生成及校验
 */
public class VerificationCode {
    int targetLength = 30;
    int targetWidth =40;
    double circleR = 5;
    double r1 = 3;
    double d1 = 1;
    double d2 = 1;

    //获取空白区域的数据，x-y坐标
    private int[][] getBlockData() {

        int[][] data = new int[targetLength][targetWidth];
        double x2 = targetLength-circleR-2;
        //随机生成圆的位置
        double h1 = circleR + Math.random() * (targetWidth-3*circleR-r1);
        double po = circleR*circleR;

        double xbegin = targetLength-circleR-r1;
        double ybegin = targetWidth-circleR-r1;

        for (int i = 0; i < targetLength; i++) {
            for (int j = 0; j < targetWidth; j++) {
                //右边○
                double d3 = Math.pow(i - x2,2) + Math.pow(j - h1,2);

                if (d1 <= po
                        || (j >= ybegin && d2 >= po)
                        || (i >= xbegin && d3 >= po)
                        ) {
                    data[i][j] = 0;

                } else {
                    data[i][j] = 1;
                }
            }
        }
        return data;
    }

    private void cutByTemplate(BufferedImage oriImage, BufferedImage targetImage, int[][] templateImage, int x,
                               int y){
        for (int i = 0; i < targetLength; i++) {
            for (int j = 0; j < targetWidth; j++) {
                int rgb = templateImage[i][j];
                // 原图中对应位置变色处理
                int rgb_ori = oriImage.getRGB(x + i, y + j);

                if (rgb == 1) {
                    //抠图上复制对应颜色值
                    targetImage.setRGB(i, y + j, rgb_ori);
                    int r = (0xff & rgb_ori);
                    int g = (0xff & (rgb_ori >> 8));
                    int b = (0xff & (rgb_ori >> 16));
                    rgb_ori = r + (g << 8) + (b << 16) + (200 << 24);
                    //原图对应位置颜色变化
                    oriImage.setRGB(x + i, y + j, rgb_ori);
                }
            }
        }
    }
}
