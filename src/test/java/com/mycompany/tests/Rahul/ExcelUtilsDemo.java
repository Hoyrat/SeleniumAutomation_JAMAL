package com.mycompany.tests.Rahul;

import com.mycompany.utilities.ExcelUtils;

public class ExcelUtilsDemo{
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        ExcelUtils excel=new ExcelUtils(projectPath+"\\src\\test\\resources\\data.xlsx","credentials");

        excel.getRowCount();
        excel.getCellDataString(0,0);
        excel.getCellDataNumber(1,1);
    }
}

