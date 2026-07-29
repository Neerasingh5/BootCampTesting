
package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

    public static void capturedScreenShot(WebDriver driver) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File dest = new File("./ScreenShots/SauceDemo_" + timeStamp + ".png");

        try {
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot Saved Successfully");

        } catch (IOException e) {
            System.out.println("Unable to Capture Screenshot " + e.getMessage());
        }
    }
}
