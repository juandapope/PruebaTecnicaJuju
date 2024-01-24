package reto.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Datos {

    private XSSFWorkbook workbook;
    private FileInputStream campo;

    public String leerDatoExcel (String hoja, String ruta, int rowValue, int cellValue) throws IOException, IOException {
        String valor = null;
        campo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell  = row.getCell(cellValue);
        valor = cell.getStringCellValue();
        workbook.close();
        campo.close();
        return valor;
    }

}
