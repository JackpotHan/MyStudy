package com.jackpotHan.poiTest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: hanjt
 * @Date: 2018/10/9 13:41
 * @Description:
 */
public class SimpleTest {

    public static void main(String[] args) throws Exception {
        String XLS ="xls";
        String XLSX ="xlsx";

        Workbook workbook ;
        MultipartFile myFile = new MultipartFile() {
            private  static  final String FILE_NAME = "./\\bigDataStudy\\aaaa.xls";
            @Override
            public String getName() {
                return FILE_NAME.substring(FILE_NAME.lastIndexOf("\\")+1,FILE_NAME.length());
            }

            @Override
            public String getOriginalFilename() {
                return FILE_NAME.substring(FILE_NAME.lastIndexOf("\\")+1,FILE_NAME.length());
            }

            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public byte[] getBytes() throws IOException {
                return new byte[0];
            }

            @Override
            public InputStream getInputStream() throws IOException {
//                return new FileInputStream(new File("D:\\IdeaProject\\myStudy\\bigDataStudy\\src\\main\\Java\\com.jackpotHan\\poiTest\\aaaa.xls"));

                return new FileInputStream(new File(FILE_NAME)) ;

            }

            @Override
            public void transferTo(File file) throws IOException, IllegalStateException {

            }
        };
        String fileName = myFile.getOriginalFilename();
        if(fileName.endsWith(XLS)){
            //office 2003
            workbook = new HSSFWorkbook(myFile.getInputStream());
        }else if(fileName.endsWith(XLSX)){
            //office 2007
            workbook = new XSSFWorkbook(myFile.getInputStream());
        }else{
            throw new Exception("文件格式不正确！！！");
        }

        Sheet sheet = workbook.getSheet("sheet1");
        int rows = sheet.getLastRowNum();//总行数
        if(rows==0){
            throw new Exception("请确定文件是否为空！！！");
        }

        for(int i = 1;i<=rows;i++){
            Row row = sheet.getRow(i);

            if(row != null){
                Student student = new Student();
                String studentNo = getCellValue(row.getCell(0));
                student.setStudentNo(studentNo);
                String name = getCellValue(row.getCell(1));
                student.setName(name);
                String grade = getCellValue(row.getCell(2));
                student.setGrade(grade);
                String ageString = getCellValue(row.getCell(3));
                if(!StringUtils.isEmpty(ageString)){
                    Integer age = Integer.parseInt(ageString);
                    student.setAge(age);
                }
                String sexString = getCellValue(row.getCell(4));
                if(!StringUtils.isEmpty(sexString) ){
                    student.setSex(Integer.parseInt(sexString));
                }
                String scoreString = getCellValue(row.getCell(5));
                if(!StringUtils.isEmpty(scoreString)){
                    Double score = Double.parseDouble(scoreString);
                    student.setSorce(score);
                }
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = getCellValue(row.getCell(6));
                if(!StringUtils.isEmpty(dateString)){
                    student.setGmtCreate(format.parse(dateString));
                }
                System.out.println(student);

            }

        }

    }

    public static String getCellValue(Cell cell){
        String value = "";
        if (cell != null){
            switch (cell.getCellType()){
                //数字
                case HSSFCell.CELL_TYPE_NUMERIC:
                    value = cell.getNumericCellValue() +"";
                    if(HSSFDateUtil.isCellDateFormatted(cell)){
                        Date date = cell.getDateCellValue();
                        if(date !=null){
                            value = new SimpleDateFormat("yyyy-MM-dd").format(date);
                        }
                    }else{
                        value = new DecimalFormat("0").format(cell.getNumericCellValue());
                    }
                    break;
                //字符串
                case HSSFCell.CELL_TYPE_STRING:
                    value = cell.getStringCellValue();
                    break;
                //boolean
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    value = cell.getBooleanCellValue()+"";
                    break;
                //公式
                case HSSFCell.CELL_TYPE_FORMULA:
                    value = cell.getCellFormula();
                    break;
                case HSSFCell.CELL_TYPE_BLANK:
                    break;
                case HSSFCell.CELL_TYPE_ERROR:
                    value = "非法字符";
                    break;
                default:
                    value = "未知类型";
                    break;
            }
        }
        return value.trim();
    }

}
