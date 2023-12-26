package vishwalearning.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		//System.out.println("path: "+System.getProperty("user.dir"));
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation Report");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA:", "Vishwanath KC");
		return extent;
	}

}
