package Escel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = ".\\data\\excel.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook() ; 
		XSSFSheet worksheet = workbook . getSheet("Data") ;
		
		File f= new File(path);
		FileInputStream AA= new FileInputStream(f);
		Workbook BJ =  WorkbookFactory.create(f);
		
		System.out.println(BJ.getSheetAt(0) .getRow(1).getCell(4));
		
	}

}
