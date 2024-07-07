package utilities;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

	public static List<Map<String, String>> getData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = null;
        Workbook workbook = null;
        List<Map<String, String>> dataList = new ArrayList<>();
        try {
            // Open the file input stream
            fis = new FileInputStream(filePath);

            // Determine the file type and create the appropriate workbook instance
            if (filePath.endsWith(".xls")) {
                workbook = new HSSFWorkbook(fis);
            } else if (filePath.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fis);
                System.out.println("----- In filePath.endsWith(\".xlsx\") block -----");
            } else {
                throw new IllegalArgumentException("The specified file is not Excel file");
            }

            // Get the specified sheet
            Sheet sheet = workbook.getSheet(sheetName);
            System.out.println("----- sheet name is ---- " + sheet.toString());
            
            
            if (sheet == null) {
                throw new IllegalArgumentException("The specified sheet does not exist in the workbook");
            }

            // Get the header row
            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                throw new IllegalArgumentException("The specified sheet is empty");
            }

            // Iterate through each row in the sheet
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    Map<String, String> data = new HashMap<>();
                    for (Cell cell : row) {
                        String header = headerRow.getCell(cell.getColumnIndex()).getStringCellValue();
                        String value = cell.toString();
                        data.put(header, value);
                    }
                    dataList.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the workbook and file input stream
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DataList is ...."+ dataList.toString());
        return dataList;
    }

}


