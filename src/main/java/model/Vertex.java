package model;

import java.util.ArrayList;

public class Vertex {
    private String exchange;
    private String currency;
    private ArrayList<Edge> edges;

    public Vertex(String exchange,
                  String currency,
                  ArrayList<Edge> edges){
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

    public static class Builder{
        private String exchange;
        private String currency;
        private ArrayList<Edge> edges;

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
                    exchange,
                    currency,
                    edges
            );
            return model;
        }
    }
}
