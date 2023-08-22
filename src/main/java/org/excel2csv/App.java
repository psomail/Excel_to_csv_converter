package org.excel2csv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        long startTime = System.currentTimeMillis();
        boolean converted = true;
        try {
            ExcelToCsvConverter converter = new ExcelToCsvConverter();
            String strSource = "E:/Excel/employee.xlsx";
            String strDestination = "E:/Excel/";
            converter.convertExcelToCSV(strSource, strDestination, DEFAULT_SEPARATOR, EXCEL_STYLE_ESCAPING);
        } catch (Exception e) {
            System.out.println("Unexpected exception");
            e.printStackTrace();
            converted = false;
        }

        if (converted) {
            System.out.println("Conversion took " + ((System.currentTimeMillis() - startTime) / 1000) + " seconds");
        }
    }
    }
}
