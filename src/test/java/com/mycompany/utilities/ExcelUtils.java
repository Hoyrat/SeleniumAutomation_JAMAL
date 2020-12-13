package com.mycompany.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public  ExcelUtils(String excelPath,String sheetName){//constructor olusturduk
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void getRowCount() {

       try {
           //get number of rows
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

    public  static void getCellData(int rowNum, int colNum){//get any data type from the cell
        try {
            DataFormatter formatter=new DataFormatter();
            Object cellData=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));//excel sheet cell data oldugu gibi getirir
            //Double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue(); --> double oldugu icin 123.0 seklinde gösteriyor,
            System.out.println(cellData);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
