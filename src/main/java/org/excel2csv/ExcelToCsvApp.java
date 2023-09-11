package org.excel2csv;

import org.excel2csv.controller.Controller;

/**
 *
 * Report builder using the Xylophone library. Xylophone provides reports with a complex structure
 * in forms of spreadsheets (XLS or XLSX format), PDF files or direct output for printing based on the XML input data.
 * <p>
 * <p>For example:</p>
 * <ul>
 * <code>java.exe -jar app.jar datafile.xml template.xls descriptor.xml false result.xls</code>
 * <li> <code>datafile.xml</code> - a file with the source XML data
 * <li> <p><code>descriptor.xml</code> - configuration file (previously mentioned as “descriptor”)
 * <li> <p><code>template.xls[x]</code> - a template with XLS or XLSX format
 * <li> <p><code>sax</code> - presence of this parameter defines if SAX or DOM parsing mode is to be used (DOM true or SAX false)
 * <li> <p><code>result.xls</code> - output file name. Its file extension determines the output format, XLS or XLSX"
 * </ul>
 * @see <a href="https://courseorchestra.github.io/xylophone">https://courseorchestra.github.io/xylophone</a>
 *
 * @author Sergei Perminov
 * @version 1.0
 */

public class ExcelToCsvApp
{
    public static void main(String[] args)
    {
        Controller.start(args);
    }
}
