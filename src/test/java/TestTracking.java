import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public class TestTracking implements ITestListener {

    private static final ExtentReports extent =ExtentManager.createInstance("report.html");
    private static ThreadLocal<ExtentTest> methodTest = new ThreadLocal<>();



    private ExtentTest getTest(ITestResult result){
        return methodTest.get();
    }

    @Override
    public synchronized void onTestStart(ITestResult result) {
      String methodName = result.getMethod().getMethodName();
      ExtentTest test = extent.createTest(methodName);
      methodTest.set(test);

      String[] groups = result.getMethod().getGroups();
       Arrays.asList(groups).forEach(x->methodTest.get().assignCategory(x));
    }


    @Override
    public synchronized void onTestSuccess(ITestResult result) {

    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {

        File file = ((TakesScreenshot) Basic.driver).getScreenshotAs(OutputType.FILE);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd-HH-mm-ss");
        Date date = new Date();
        String currentDate = dateFormat.format(date);

        try {
            FileUtils.copyFile(file, new File("srg/screenshot/" + currentDate + ".png"));
        } catch (IOException e) {
            throw new RuntimeException();
        }
        getTest(result).fail(result.getThrowable());
    }
    public synchronized void onFinish(ITestContext context){
        extent.flush();
    }


}
