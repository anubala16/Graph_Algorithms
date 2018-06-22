/**
 * 
 */
package main;

import java.util.ArrayList;

import Util.Graph;
import Util.Vertex;

/**
 * 
 * 
 * @author ashah 
 * @author abalaji 
 *
 */
public class ShortestPathDijkstra {

	private Graph graph; 
	private Vertex source; 
	private ArrayList<Vertex> path; 
	
	public ShortestPathDijkstra(Graph g, Vertex src) {
		// TODO Auto-generated constructor stub
		System.out.println("Finding shortest path for graph...");
		this.graph = g;
		this.source = src;
		this.path = new ArrayList<Vertex>();
	}

	/**
	 * @return the graph
	 */
	public Graph getGraph() {
		return graph;
	}

	/**
	 * @param graph the graph to set
	 */
	public void setGraph(Graph graph) {
		this.graph = graph;
	}

	/**
	 * @return the source
	 */
	public Vertex getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Vertex source) {
		this.source = source;
	}

}
