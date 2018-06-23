/**
 * 
 */
package Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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

	private int vertexCount, edgeCount; 
	private LinkedList<Vertex> adjList[];
	
	@SuppressWarnings("unchecked")
	public Graph(int vertexCount, int edgeCount) {
		this.vertexCount = vertexCount;
		this.edgeCount = edgeCount;
		adjList = new LinkedList[vertexCount];
		
		for(int i = 0; i < vertexCount; i++) {
			adjList[i] = new LinkedList<Vertex>();
		}
	}

	public void addEdge(Edge e) {
		Vertex v1 = e.getA();
		Vertex v2 = e.getB();
		int a = v1.getName() - 65;
		int b = v2.getName() - 65;
		System.out.println("V1 name: " + v1.getName() + "\tint: " + a);
		adjList[a].addLast(v2);
		adjList[b].addLast(v1);
		/**
		for (int i = 0; i < vertexCount; i++) {
			if (adjList[i].getFirst().getName() == a) {
				adjList[i].addLast(v2);
			} else if (adjList[i].getFirst().getName() == b) {
				adjList[i].addLast(v1);
			} 
		}
		*/
	}

	/**
	 * Prints the adjacency list for the graph 
	 */
	public void print() {
		for(int i = 0; i < vertexCount; i++)
        {
			char v = (char) (i + 65);
            System.out.print("Adjacency list of vertex " + v);
            for(Vertex current: adjList[i]){
                System.out.print(" -> "+ current.toString());
            }
            System.out.println("\n");
        }
	} 
	
	/**
	public Vertex getVertex(String name) {
		 Iterator<Vertex> iterator = vertices.iterator();
	        while(iterator.hasNext()) {
	            Vertex v = iterator.next();
	            if(v.getName().equals(name))             
	                return v;
	        }

	        return null;     
	}
	*/
}
