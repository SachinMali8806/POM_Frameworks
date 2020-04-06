package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadExcel {
	HSSFWorkbook wb;
	HSSFSheet sheet1;

	public ReadExcel(String excelPath)  {
		try {
			File source=new File(excelPath);
			FileInputStream test =new FileInputStream(source);
			wb=new HSSFWorkbook(test);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	@SuppressWarnings("unused")
	public String getIntData(int sheetnumber,int row,int column){
		sheet1=wb.getSheetAt(sheetnumber);
		int rowcount = sheet1.getPhysicalNumberOfRows();
		System.out.println(rowcount+1);
		double data=sheet1.getRow(row).getCell(column).getNumericCellValue();
		String abc = new BigDecimal(sheet1.getRow(row).getCell(column).getNumericCellValue()).toPlainString();
		return abc;
	}

	public String getStringData(int sheetnumber,int row,int column){
		sheet1=wb.getSheetAt(sheetnumber);
		int rowcount=sheet1.getLastRowNum();
		System.out.println(rowcount+1);
		String data1=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data1;
	}

}



