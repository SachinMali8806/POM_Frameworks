package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestResult;

import com.qaprosoft.carina.core.foundation.utils.R;

import org.openqa.selenium.WebDriver;

public class PreConditions1 {

	public static WebDriver driver;
	public static boolean isLoggedIn = false;
	static XSSFCellStyle cellstyle;
	static XSSFCellStyle cellFormat;
	public static String screenshoot_path = null;
	public static String report_path = null;
	Date StartTime = Calendar.getInstance().getTime();

	public void initReport(HashMap<String, String> testDetail) throws Exception {
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		SimpleDateFormat month = new SimpleDateFormat("MMM");
		SimpleDateFormat day = new SimpleDateFormat("dd");
		Calendar c = Calendar.getInstance();

		report_path = R.CONFIG.get("excel_report_path") + "\\" + year.format(c.getTime()) + "_"
				+ month.format(c.getTime()) + "_" + day.format(c.getTime()) + "\\" + R.CONFIG.get("env") + "\\"
				+ testDetail.get("Module") + "\\" + testDetail.get("SubModule") + "\\" + testDetail.get("TestCaseID")
				+ "\\";
		
		CreateReportFile(testDetail);
		reportPath();
	}

	public String reportPath() throws Exception {
		System.out.println(report_path);
		return report_path;

	}

	@SuppressWarnings("resource")
	public static String CreateReportFile(HashMap<String, String> testDetail) throws Exception {
		File theDir = new File(report_path);
		if (!theDir.exists()) {
			boolean result = false;
			try {
				theDir.mkdirs();
				result = true;
			} catch (SecurityException localSecurityException) {
			}
			if (result) {
				System.out.println("Report Directory Created");
			} else {
				System.out.println("Report Directory Already Exist");
			}
		}

		File fl = new File(report_path);
		Date sys_date = new Date();
		String strDateFormat = "HH_mm_ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(sys_date);
		String FileName = testDetail.get("TestCaseID");
		report_path = report_path + FileName + "_" + formattedDate + ".xlsx";

		System.out.println("Report File Name: " + report_path);
		fl = new File(report_path);
		fl.createNewFile();
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Execution Report");
		sheet.setColumnWidth(0, 500 * 10);

		XSSFRow row = sheet.createRow(0);
		row.setHeight((short) 600);

		Font font = workbook.createFont();
		font.setColor(IndexedColors.WHITE.getIndex());
		((XSSFFont) font).setBold(true);
		font.setFontHeightInPoints((short) 11);

		Font cellfont = workbook.createFont();
		cellfont.setFontHeightInPoints((short) 10);
		cellfont.setFontName("Calibri");

		cellFormat = workbook.createCellStyle();
		cellFormat.setAlignment(HorizontalAlignment.CENTER);
		cellFormat.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
		cellFormat.setBorderBottom(BorderStyle.THIN);
		cellFormat.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		cellFormat.setBorderLeft(BorderStyle.THIN);
		cellFormat.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		cellFormat.setBorderRight(BorderStyle.THIN);
		cellFormat.setRightBorderColor(IndexedColors.BLACK.getIndex());
		cellFormat.setBorderTop(BorderStyle.THIN);
		cellFormat.setTopBorderColor(IndexedColors.BLACK.getIndex());
		cellFormat.setFont(font);
		cellFormat.setWrapText(true);
		cellFormat.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
		cellFormat.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cellstyle = workbook.createCellStyle();
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

		LinkedList<String> headers = new LinkedList<>();
		headers.add("Module");
		headers.add("Submodule");
		//headers.add("Device");
		headers.add("TestType");
		headers.add("Scenario ID");
		headers.add("Scenario Description");
		headers.add("Test Case ID");
		headers.add("Test Case Description");
		headers.add("Expected Result");
		headers.add("Actual Result");
		headers.add("Status");
		headers.add("Execution Duration(hh:mm:ss)");
		headers.add("Execution Date");
		// headers.add("Screenshot Path");

		int colNum = 0;

		for (String header : headers) {
			Cell cell = row.createCell(colNum++);
			cell.setCellStyle(cellFormat);
			cell.setCellValue(header);
		}

		XSSFSheet sheet1 = workbook.createSheet("Verification_Point");

		sheet1.setColumnWidth(0, 500 * 10);

		XSSFRow row1 = sheet1.createRow(0);
		row1.setHeight((short) 600);

		colNum = 0;

		headers.clear();
		headers.add("TestCase ID");
		headers.add("Module");
		headers.add("Submodule");
		headers.add("TestCase Description");
		headers.add("Field");
		headers.add("Expected Result");
		headers.add("Actual Result");
		headers.add("Status");

		colNum = 0;

		for (String header : headers) {
			Cell cell = row1.createCell(colNum++);
			cell.setCellStyle(cellFormat);
			cell.setCellValue(header);

		}

		FileOutputStream outputstream = new FileOutputStream(fl);
		workbook.write(outputstream);
		outputstream.close();

		return fl.toString();

	}

	public ExecutionReport initExecReport(HashMap<String, String> testDetail) {
		try {
			initReport(testDetail);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		String ExecutionDate = dateFormat.format(new Date());
		ExecutionReport exe = new ExecutionReport();
		exe.setModule(testDetail.get("Module"));
		exe.setSubmodule(testDetail.get("SubModule"));
		exe.setScenario_id(testDetail.get("ScenarioID"));
		exe.setTestcaseid(testDetail.get("TestCaseID"));
		exe.setScenario_desc(testDetail.get("ScenarioDescription"));
		exe.setTestcase_desc(testDetail.get("TestCaseDescription"));
		//exe.setDevice(R.CONFIG.get("capabilities.deviceName"));
		exe.setTestType(R.CONFIG.get("Testing_type"));
		exe.setExecution_date(ExecutionDate);
		exe.setExpected_result(testDetail.get("ExpectedResult"));
		return exe;
	}

	public void writeReport(ExecutionReport exe, HashMap<String, String> testDetail, ITestResult result)
			throws Exception {
		exe.setActual_result(exe.getExpected_result());
		exe.setStatus("Pass");
		Date EndTime = Calendar.getInstance().getTime();
		long diff = EndTime.getTime() - StartTime.getTime();
		long diffsec = diff / 1000 % 60;
		long diffmin = diff / (60 * 1000) % 60;
		long diffhr = diff / (24 * 60 * 1000) % 24;
		String temp = diffhr + ":" + diffmin + ":" + diffsec;
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = sdf.parse(temp);

		exe.setExecution_time(date);
		Executor1.writeReport(exe);
	}

	public void addVPinReport(HashMap<String, String> testDetails, String actualResult, String VerificationDescription,
			String expectedResult) throws Exception {
		VerificationPoint vp = new VerificationPoint();
		vp.setModule(testDetails.get("Module"));
		vp.setSubmodule(testDetails.get("SubModule"));
		vp.setTestcaseid(testDetails.get("TestCaseID"));
		vp.setTestcase_desc(testDetails.get("TestCaseDescription"));
		vp.setExpected_result(expectedResult);
		vp.setActual_result(actualResult);
		vp.setStatus("Fail");

		if (actualResult != null) {
			if (actualResult.equals(expectedResult)) {
				// System.out.println("actualResult.contains(_expectedResult)");
				vp.setStatus("Pass");
			}

			if (expectedResult.equals(actualResult)) {
				// System.out.println("_expectedResult.contains(actualResult)");
				vp.setStatus("Pass");
			}

		}
		vp.setField(VerificationDescription);
		Executor1.vpReport(vp);
	}

	public void handleException(HashMap<String, String> testDetail, ExecutionReport exe, ITestResult result, List<Boolean>AssertFlag)
			throws Exception {
		if(AssertFlag.contains(false)){
			result.setStatus(ITestResult.FAILURE);
			exe.setActual_result("Verification Failure");
		}else{
		exe.setActual_result(result.getThrowable().getLocalizedMessage().toString());
		}
		exe.setStatus("Fail");
		Date EndTime = Calendar.getInstance().getTime();
		SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
		long diff = EndTime.getTime() - StartTime.getTime();
		long diffsec = diff / 1000 % 60;
		long diffmin = diff / (60 * 1000) % 60;
		long diffhr = diff / (24 * 60 * 1000) % 24;
		String temp = diffhr + ":" + diffmin + ":" + diffsec;
		Date ExecutionDuration = timeformat.parse(temp);
		exe.setExecution_time(ExecutionDuration);
		String screenshotpath = "";
		exe.setScreenshot_path(screenshotpath);
		Executor1.writeReport(exe);
	}
	
	public void finalExecutionReport(ITestResult result,ExecutionReport exe, HashMap<String, String>testDetail, List<Boolean>AssertFlag) throws Exception{
		int condFlag=0;
    	if(result.isSuccess()){
    		condFlag = 0;
    		if(AssertFlag.contains(false)){
        		condFlag = 1;
        	}
    	}
    	
    	if(condFlag==1){
    		handleException(testDetail, exe, result,AssertFlag);
    	}
    	else{
    		writeReport(exe, testDetail, result);//For Excel report
    	}
    
	}

	/*public void AsserVP(String AssertType, String Actual, String Expected, String Verification_Description,
			HashMap<String, String> testDetails) throws Exception {
		SoftAssert softAssert = new SoftAssert();
		switch (AssertType.toUpperCase()) {
		case "HARDASSERT": {
			addVPinReport(testDetails, Actual, Verification_Description, Expected);
			Assert.assertEquals(Actual, Expected);
		}

		case "SOFTASSERT":
		default: {
			addVPinReport(testDetails, Actual, Verification_Description, Expected);
			softAssert.assertTrue(Actual.equals(Expected));
		}
		}
		softAssert.assertAll();
	}*/
}
