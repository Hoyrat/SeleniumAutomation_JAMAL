package com.mycompany.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public  ExcelUtils(String excelPath,String sheetName){
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void getRowCount() {

       try {
           int rowCount=sheet.getPhysicalNumberOfRows();
           System.out.println("Number of rows: "+rowCount);

       }catch(Exception e){
           System.out.println(e.getMessage());
           System.out.println(e.getCause());
           e.printStackTrace();
       }
    }

    public  static void getCellDataString(int rowNum, int colNum){
        try {
            String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public  static void getCellDataNumber(int rowNum, int colNum){
        try {

            Double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);


        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
