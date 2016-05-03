package com.example.alharbi.datastructure;

import java.util.LinkedList;

/**
 * Created by bndaralharbi on 5/3/2016 AD.
 */
public class Graph {
    private LinkedList<City> cities;
    private LinkedList<GraphEdge> edges;

    public Graph()
    {
        cities = null;
        edges = null;
    }

    public LinkedList<City> getCities()
    {
        return cities;
    }
    public LinkedList<GraphEdge> getEdges()
    {
        return edges;
    }
    public void addCity(String name)
    {
        cities.add(new City(name));
    }
}
