package com.graph.rest.vo;

import com.graph.domain.Graph;
import com.graph.domain.Vertex;

public class ShortestPathVo {

    private Graph graph;

    private Vertex origin;

    private Vertex destination;

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public Vertex getOrigin() {
        return origin;
    }

    public void setOrigin(Vertex origin) {
        this.origin = origin;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }
}
