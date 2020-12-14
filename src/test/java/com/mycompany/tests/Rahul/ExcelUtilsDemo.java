package com.mycompany.tests.Rahul;

import com.mycompany.utilities.ExcelUtils;

public class ExcelUtilsDemo{
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        String excelPath="\\src\\test\\resources\\data.xlsx";
        String sheetNAme="credentials";
        ExcelUtils excel=new ExcelUtils(projectPath+excelPath,sheetNAme);

        excel.getRowCount();
        //excel.getCellDataString(0,0);
        excel.getCellData(0,0);
        excel.getCellData(0,1);
        excel.getCellData(1,0);
        excel.getCellData(1,1);
        excel.getCellData(2,0);
        excel.getCellData(2,1);
        excel.getCellData(3,0);
        excel.getCellData(3,1);



    }
}

