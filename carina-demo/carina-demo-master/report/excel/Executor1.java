package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Executor1 {

	public static String filepath;
	static XSSFCellStyle cellstyle;

	public static void writeReport(ExecutionReport exe) throws Exception {
		PreConditions cond = new PreConditions();
		cond.getProperties();
		filepath = cond.reportPath();
		System.out.println("filepath " +filepath);
		File file = new File(filepath);
		System.out.println("filepath................................. " + filepath);
		FileInputStream fIP = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fIP);
		XSSFSheet sheet = workbook.getSheetAt(0);

		ExecutionReport report =  exe;
		
		int x = sheet.getLastRowNum() + 1;
		int col = 0;
		
		XSSFRow ex_row = sheet.createRow(x++);
		
		String scenarioid = report.getScenario_id();
		String scenario_desc = report.getScenario_desc();
		String testcaseid = report.getTestcaseid();
		String module = report.getModule();
		String submodule = report.getSubmodule();
		String tc_desc = report.getTestcase_desc();
		String exp_result = report.getExpected_result();
		String act_result = report.getActual_result();
		String status = report.getStatus();
		Date exe_time = report.getExecution_time();
		String exe_date = report.getExecution_date();
		String ss_path = report.getScreenshot_path();
		String device = report.getDevice();
		String testtype = report.getTestType();

		Font cellfont = workbook.createFont();
        cellfont.setFontHeightInPoints((short) 10);
        cellfont.setFontName("Calibri");
        
        XSSFCellStyle cellstyle = workbook.createCellStyle();
		cellstyle.setBorderBottom(BorderStyle.THIN);
		cellstyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setBorderLeft(BorderStyle.THIN);
		cellstyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setBorderRight(BorderStyle.THIN);
		cellstyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setBorderTop(BorderStyle.THIN);
		cellstyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setWrapText(true);
		cellstyle.setFont(cellfont);
		
		sheet.setColumnWidth(col, 500 * 10);
		Cell cell1 = ex_row.createCell(col++);
		cell1.setCellStyle(cellstyle);
		cell1.setCellValue(module);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell2 = ex_row.createCell(col++);
		cell2.setCellStyle(cellstyle);
		cell2.setCellValue(submodule);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell3 = ex_row.createCell(col++);
		cell3.setCellStyle(cellstyle);
		cell3.setCellValue(device);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell4 = ex_row.createCell(col++);
		cell4.setCellStyle(cellstyle);
		cell4.setCellValue(testtype);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell5 = ex_row.createCell(col++);
		cell5.setCellStyle(cellstyle);
		cell5.setCellValue(scenarioid);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell6 = ex_row.createCell(col++);
		cell6.setCellStyle(cellstyle);
		cell6.setCellValue(scenario_desc);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell7 = ex_row.createCell(col++);
		cell7.setCellStyle(cellstyle);
		cell7.setCellValue(testcaseid);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell8 = ex_row.createCell(col++);
		cell8.setCellStyle(cellstyle);
		cell8.setCellValue(tc_desc);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell9 = ex_row.createCell(col++);
		cell9.setCellStyle(cellstyle);
		cell9.setCellValue(exp_result);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell10 = ex_row.createCell(col++);
		cell10.setCellStyle(cellstyle);
		cell10.setCellValue(act_result);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell11 = ex_row.createCell(col++);
		cell11.setCellStyle(cellstyle);
		cell11.setCellValue(status);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell12 = ex_row.createCell(col++);
		cell12.setCellStyle(cellstyle);
		cell12.setCellValue(exe_time);

		sheet.setColumnWidth(col, 500 * 20);
		Cell cell13 = ex_row.createCell(col++);
		cell13.setCellStyle(cellstyle);
		cell13.setCellValue(exe_date);

		sheet.setColumnWidth(col, 500 * 10);
		Cell cell14 = ex_row.createCell(col++);
		cell14.setCellStyle(cellstyle);
		cell14.setCellValue(ss_path);
		
		FileOutputStream outputstream = new FileOutputStream(file);
		workbook.write(outputstream);
		outputstream.close();
		workbook.close();	
		
	}
	
	@SuppressWarnings("unused")
	public static void vpReport(VerificationPoint vp) throws Exception {
		PreConditions cond = new PreConditions();
		cond.getProperties();
		filepath = cond.reportPath();
		
		System.out.println("filepath " +filepath);
		File file = new File(filepath);
		System.out.println("filepath................................. " + filepath);
		FileInputStream fIP = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fIP);
		XSSFSheet sheet = workbook.getSheetAt(1);

		VerificationPoint report =  vp;
		
		int x = sheet.getLastRowNum() + 1;
		int col = 0;
		
		XSSFRow ex_row = sheet.createRow(x++);
		
		Font cellfont = workbook.createFont();
        cellfont.setFontHeightInPoints((short) 10);
        cellfont.setFontName("Calibri");
        
        XSSFCellStyle cellstyle = workbook.createCellStyle();
		cellstyle.setBorderBottom(BorderStyle.THIN);
		cellstyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setBorderLeft(BorderStyle.THIN);
		cellstyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setBorderRight(BorderStyle.THIN);
		cellstyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setBorderTop(BorderStyle.THIN);
		cellstyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
		cellstyle.setWrapText(true);
		cellstyle.setFont(cellfont);
		
		String testcaseid = vp.getTestcaseid();
		String module = vp.getModule();
		String submodule = vp.getSubmodule();
		String tc_desc = vp.getTestcase_desc();
		String field = vp.getField();
		String exp_result = vp.getExpected_result();
		String act_result = vp.getActual_result();
		String status = vp.getStatus();
		
		sheet.setColumnWidth(col, 500*10);
        Cell cell1 = ex_row.createCell(col++);
        cell1.setCellStyle(cellstyle);
        cell1.setCellValue(testcaseid);
        
        sheet.setColumnWidth(col, 500*10);
        Cell cell3 = ex_row.createCell(col++);
        cell3.setCellStyle(cellstyle);
        cell3.setCellValue(module);
        
        sheet.setColumnWidth(col, 500*10);
        Cell cell4 = ex_row.createCell(col++);
        cell4.setCellStyle(cellstyle);
        cell4.setCellValue(submodule);
        
        sheet.setColumnWidth(col, 500*10);
        Cell cell5 = ex_row.createCell(col++);
        cell5.setCellStyle(cellstyle);
        cell5.setCellValue(tc_desc);
        
        sheet.setColumnWidth(col, 500*10);
        Cell cell7 = ex_row.createCell(col++);
        cell7.setCellStyle(cellstyle);
        cell7.setCellValue(field);
       
        sheet.setColumnWidth(col, 500*10);
        Cell cell8 = ex_row.createCell(col++);
        cell8.setCellStyle(cellstyle);
        cell8.setCellValue(exp_result);
        
        sheet.setColumnWidth(col, 500*10);
        Cell cell9 = ex_row.createCell(col++);
        cell9.setCellStyle(cellstyle);
        cell9.setCellValue(act_result);
        
        sheet.setColumnWidth(col, 500*10);
        Cell cell10 = ex_row.createCell(col++);
        cell10.setCellStyle(cellstyle);
        cell10.setCellValue(status);        
        
        FileOutputStream outputstream = new FileOutputStream(file);
		workbook.write(outputstream);
		outputstream.close();
		workbook.close();
		
	}
	
}