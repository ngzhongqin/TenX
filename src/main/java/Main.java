import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static Properties configProperties;
    public final static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) throws Exception {
        String logFilePath = getApplicationPath("conf/log4j.properties");
        PropertyConfigurator.configure(logFilePath);
        logger.info("Started Main.class, application.root = " + logFilePath);



    }

    public static String getApplicationPath(String filePath) {
        String applicationRoot = System.getProperty("application.root");
        if(applicationRoot!=null){
            filePath = applicationRoot+filePath;
        }

        return filePath;
    }

    static {
        configProperties = new Properties();

        String configFilePath = getApplicationPath("conf/conf.properties");

        try {
            configProperties.load(new FileInputStream(configFilePath));
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
