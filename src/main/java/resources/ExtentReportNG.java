package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

    public void Extentrepsetup(){
        ExtentReports reports;
        String path= "C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\test\\java\\DataFiles"+ "\\reports\\index.html";
        ExtentSparkReporter ExtentSparkrep = new ExtentSparkReporter(path);

        ExtentSparkrep.config().setReportName("reportnamefirst");
        ExtentSparkrep.config().setDocumentTitle("Document title second");


        reports= new ExtentReports();

        reports.attachReporter(ExtentSparkrep);
        reports.setSystemInfo("Tester","Ashwin");


    }
}
