package excel;

public class VerificationPoint {

	private String module;
	private String submodule;
	private String testcaseid;
	private String page_name;
	private String field;
	private String expected_result;
	private String actual_result;
	private String status;
	private String testcase_desc;
	
	
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
	public String getTestcaseid() {
		return testcaseid;
	}
	public void setTestcaseid(String testcaseid) {
		this.testcaseid = testcaseid;
	}
	public String getPage_name() {
		return page_name;
	}
	public void setPage_name(String page_name) {
		this.page_name = page_name;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getExpected_result() {
		return expected_result;
	}
	public void setExpected_result(String expected_result) {
		this.expected_result = expected_result;
	}
	public String getTestcase_desc() {
		return testcase_desc;
	}
	public void setTestcase_desc(String testcase_desc) {
		this.testcase_desc = testcase_desc;
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
	
}
