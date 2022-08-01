package Project01;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {

	public static void main(String[] args) throws IOException, BiffException {
		FileInputStream file = new FileInputStream("‪C:\\Users\\sanka\\Downloads\\tests-example.xls");
		Workbook w1 = Workbook.getWorkbook(file);
		Sheet s1 = w1.getSheet(0);
		String firstcell = s1.getCell(1, 1).getContents();
		String secondcell = s1.getCell(0, 2).getContents();
		System.out.println(firstcell);
		System.out.println(secondcell);
		
	}

}
