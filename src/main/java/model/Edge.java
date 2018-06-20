package model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Edge {
    private Timestamp timestamp;
    private Vertex fromV;
    private Vertex toV;
    private BigDecimal factor;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Vertex getFromV() {
        return fromV;
    }

    public void setFromV(Vertex fromV) {
        this.fromV = fromV;
    }

    public Vertex getToV() {
        return toV;
    }

    public void setToV(Vertex toV) {
        this.toV = toV;
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }

    public Edge(Timestamp timestamp,
                Vertex fromV,
                Vertex toV,
                BigDecimal factor){
        this.timestamp=timestamp;
        this.fromV=fromV;
        this.toV=toV;
        this.factor=factor;
    }

    public static class Builder{
        private Timestamp timestamp;
        private Vertex fromV;
        private Vertex toV;
        private BigDecimal factor;

        public Builder timestamp(Timestamp timestamp){
            this.timestamp=timestamp;
            return this;
        }

        public Builder fromV(Vertex fromV){
            this.fromV=fromV;
            return this;
        }

        public Builder toV(Vertex toV){
            this.toV=toV;
            return this;
        }

        public Builder factor(BigDecimal factor){
            this.factor=factor;
            return this;
        }

        public Edge build(){
            Edge model = new Edge(timestamp,fromV,toV,factor);
            return model;
        }

    }
}
