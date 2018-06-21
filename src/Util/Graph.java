/**
 * 
 */
package Util;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * 
 * @author ashah 
 * @author abalaji 
 *
 */
public class Graph {

	private Set<Vertex> vertices; 
	private ArrayList<Edge> edges; 
	
	public Graph(int vertexCount, int edgeCount) {
		vertices = new TreeSet<Vertex>();
		edges = new ArrayList<Edge>(edgeCount);
	}

	public void add(Edge e) {
		edges.add(e);
		vertices.add(e.getA());
		vertices.add(e.getB());
	}

	/**
	 * @return the vertices
	 */
	public Set<Vertex> getVertices() {
		return vertices;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(Set<Vertex> vertices) {
		this.vertices = vertices;
	}

	/**
	 * @return the edges
	 */
	public ArrayList<Edge> getEdges() {
		return edges;
	}

	/**
	 * @param edges the edges to set
	 */
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}

}
