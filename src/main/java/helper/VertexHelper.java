package helper;

import model.Vertex;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class VertexHelper {
    public final static Logger logger = Logger.getLogger(VertexHelper.class);

    public static ArrayList<Vertex> addVertex(ArrayList<Vertex> vertices, Vertex vertex){
        if(vertices==null){
            return new ArrayList<Vertex>();
        }
        vertices.add(vertex);
        return vertices;
    }

    public static void printVertices(ArrayList<Vertex> vertices) {
        if(vertices==null){
            return;
        }
        if(vertices.isEmpty()){
            return;
        }
        for(int i=0;i<vertices.size();i++){
            logger.info("index="+i+" exchange="+vertices.get(i).getExchange()+" currency="+vertices.get(i).getCurrency());
        }
    }
}
