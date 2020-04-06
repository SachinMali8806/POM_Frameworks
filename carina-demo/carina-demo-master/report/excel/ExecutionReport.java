package excel;

import java.util.Date;

public class ExecutionReport {

	private String module;
	private String submodule;
	private String scenario_id;
	private String scenario_desc;
	private String testcaseid;
	private String testcase_desc;
	private String expected_result;
	private String actual_result;
	private String status;
	private Date execution_time;
	private String execution_date;
	private String screenshot_path;
	private String device;
	private String TestType;
	
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getSubmodule() {
		return submodule;
	}
	public void setSubmodule(String submodule) {
		this.submodule = submodule;
	}
	
	public String getExpected_result() {
		return expected_result;
	}
	public void setExpected_result(String expected_result) {
		this.expected_result = expected_result;
	}
	public String getActual_result() {
		return actual_result;
	}
	public void setActual_result(String actual_result) {
		this.actual_result = actual_result;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getExecution_time() {
		return execution_time;
	}
	public void setExecution_time(Date execution_time) {
		this.execution_time = execution_time;
	}
	public String getExecution_date() {
		return execution_date;
	}
	public void setExecution_date(String execution_date) {
		this.execution_date = execution_date;
	}
	public String getScreenshot_path() {
		return screenshot_path;
	}
	public void setScreenshot_path(String screenshot_path) {
		this.screenshot_path = screenshot_path;
	}
	public String getTestcaseid() {
		return testcaseid;
	}
	public void setTestcaseid(String testcaseid) {
		this.testcaseid = testcaseid;
	}
	public String getTestcase_desc() {
		return testcase_desc;
	}
	public void setTestcase_desc(String testcase_desc) {
		this.testcase_desc = testcase_desc;
	}
	public String getScenario_id() {
		return scenario_id;
	}
	public void setScenario_id(String scenario_id) {
		this.scenario_id = scenario_id;
	}
	public String getScenario_desc() {
		return scenario_desc;
	}
	public void setScenario_desc(String scenario_desc) {
		this.scenario_desc = scenario_desc;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getTestType() {
		return TestType;
	}
	public void setTestType(String testType) {
		TestType = testType;
	}
	
}
