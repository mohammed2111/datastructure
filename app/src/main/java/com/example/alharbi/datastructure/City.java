package com.example.alharbi.datastructure;

import java.util.LinkedList;

/**
 * Created by bndaralharbi on 5/3/2016 AD.
 */
public class City {
    private String name;
    private LinkedList<Edge> edges;

    public City(String name)
    {
        this.name = name;

    }
    public City(String name, LinkedList<Edge> edges)
    {
        this.name = name;
        this.edges = edges;
    }

    public String getName()
    {
        return name;
    }
    public LinkedList<Edge> getEdges()
    {
        return edges;
    }
}
