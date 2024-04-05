import com.aventstack.extentreports.*;
import com.aventstack.extentreports.model.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ExtentManager{

    private static ExtentReports extent;
    public static ExtentReports createInstance(String file) {
        ExtentReporter htmlReporter = new ExtentHtmlReporter(file);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return  extent;
    }



}
