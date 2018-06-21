package model;

import java.util.ArrayList;

public class Vertex {
    private long id;
    private String exchange;
    private String currency;
    private ArrayList<Edge> edges;

    public Vertex(long id,
                  String exchange,
                  String currency,
                  ArrayList<Edge> edges){
        this.id=id;
        this.exchange=exchange;
        this.currency=currency;
        this.edges=edges;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static class Builder{
        private long id;
        private String exchange;
        private String currency;
        private ArrayList<Edge> edges;

        public Builder id(long id){
            this.id=id;
            return this;
        }

        public Builder exchange(String exchange){
            this.exchange=exchange;
            return this;
        }

        public Builder currency(String currency){
            this.currency=currency;
            return this;
        }

        public Builder edges(ArrayList<Edge> edges){
            this.edges=edges;
            return this;
        }

        public Vertex build(){
            Vertex model = new Vertex(
                    id,
                    exchange,
                    currency,
                    edges
            );
            return model;
        }
    }
}
