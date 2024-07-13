package TestRun.TestComonents;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners1 implements ITestListener {
    ExtentReports reports;
    public void onStart(ITestContext arg)
    {
        String path= "C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\test\\java\\DataFiles"+ "\\reports\\index.html";
        ExtentSparkReporter ExtentSparkrep = new ExtentSparkReporter(path);

        ExtentSparkrep.config().setReportName("reportnamefirst");
        ExtentSparkrep.config().setDocumentTitle("Document title second");


        reports= new ExtentReports();

        reports.attachReporter(ExtentSparkrep);
        reports.setSystemInfo("Tester","Ashwin");
    }

    public void onFinish(ITestContext arg)
    {
        System.out.println("Finishes the execution");
    }


    public void onTestStart(ITestResult result)
    {
        System.out.println("on Test start "+ result.getName());
    }

    public void onTestSuccess(ITestResult arg){
        System.out.println("On Test success"+ arg.getName());
    }
    public void onTestFailure(ITestResult arg){
        System.out.println("On Test Failure"+ arg.getName());
    }




}
