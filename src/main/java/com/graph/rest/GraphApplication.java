package com.graph.rest;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class GraphApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public GraphApplication() {
        singletons.add(new GraphRest());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}