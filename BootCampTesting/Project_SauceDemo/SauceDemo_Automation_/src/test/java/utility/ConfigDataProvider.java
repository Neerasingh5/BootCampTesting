package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    Properties pro;

    public ConfigDataProvider() {

        pro = new Properties();

        try {
            File src = new File("./configuration/config.properties");

            FileInputStream fis = new FileInputStream(src);

            pro.load(fis);

            System.out.println("Config File Loaded Successfully");

        } catch (Exception e) {

            System.out.println("Unable to Load Config File");
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return pro.getProperty("Browser");
    }

    public String getAppURL() {
        return pro.getProperty("AppUrl");
    }
}
