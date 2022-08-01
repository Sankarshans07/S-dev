package Project01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Apache_Excel {

	public static void main(String[] args) throws IOException {
       FileInputStream file = new FileInputStream("C:\\Users\\sanka\\Downloads\\tests-example.xls");
       XSSFWorkbook w1 = new XSSFWorkbook(file);
       w1.unLock();
       XSSFSheet sheet = w1.getSheetAt(0);
       XSSFCell firstcell = sheet.getRow(0).getCell(1);
       XSSFCell secondcell = sheet.getRow(1).getCell(2);
       w1.unLock();
       System.out.println(sheet.getSheetName());
       
;	}

}
