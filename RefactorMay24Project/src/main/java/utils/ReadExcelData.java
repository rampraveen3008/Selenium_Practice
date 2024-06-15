package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData {

    public static String getDataFromSheet(String sheetName, int rowIndex, int columnIndex) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/testdata/DataSheet.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        String cellValue = sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
        return cellValue;
    }
}
