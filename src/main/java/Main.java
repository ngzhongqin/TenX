import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import constant.Currency;
import constant.Exchange;
import helper.VertexHelper;
import model.Vertex;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static Properties configProperties;
    public final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        String logFilePath = getApplicationPath("conf/log4j.properties");
        PropertyConfigurator.configure(logFilePath);
        logger.info("Started Main.class, application.root = " + logFilePath);

        ArrayList<Vertex> vertices = new ArrayList<Vertex>();
        Vertex vertex1 = new Vertex.Builder()
                .exchange(Exchange.KRAKEN)
                .currency(Currency.BTC)
                .build();

        Vertex vertex2 = new Vertex.Builder()
                .exchange(Exchange.KRAKEN)
                .currency(Currency.USD)
                .build();

        vertices = VertexHelper.addVertex(vertices,vertex1);
        vertices = VertexHelper.addVertex(vertices,vertex2);

        VertexHelper.printVertices(vertices);


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
