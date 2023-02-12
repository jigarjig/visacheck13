package gov.uk.check.visa.testbase;

import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.InterruptedIOException;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() throws InterruptedIOException, InterruptedException {
        selectBrowser(browser);
        //new Utility().acceptCookiesAndSwitchToIframe();
    }

//    @AfterMethod
//    public void tearDown(){
//        closeBrowser();
//    }
}
