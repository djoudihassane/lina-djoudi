package Escel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		String path = ".\\data\\excel.xlsx";
		
		
		XSSFWorkbook workbook = new XSSFWorkbook() ; 
		XSSFSheet worksheet = workbook . createSheet("Data") ;
		//Row row = worksheet . createRow(0);
		//Cell cell = row .createCell(0);
		//cell.setCellValue("broser");
		//cell.setCellValue("hhhhhhh");
		
		  worksheet.createRow(0).createCell(1).setCellValue("grade");
		
		 worksheet .createRow(0).createCell(0).setCellValue("name");
		/*int value=100;
		for(int i=1 ; i <12 ; i++) {
			worksheet .createRow(i).createCell(4).setCellValue(value);	
			value=value+5;
		}*/
		
		File f= new File(path);
		FileOutputStream AA= new FileOutputStream(f);
		
		workbook .write(AA);
		
		AA.close();
		
	}

}
