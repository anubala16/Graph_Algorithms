/**
 * 
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Util.Edge;
import Util.Graph;
import Util.Vertex;

/**
 * 
 * 
 * @author ashah
 * @author abalaji
 *
 */
public class SimplifyGraph {

	public static void main(String[] args) {

		// parse file index to open each input file and parse each into a graph
		File fileIndex = new File("fileIndex.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(fileIndex);
			while (scan.hasNextLine()) {
				scan.nextLine(); // skip initial blank line
				scan.nextLine(); // skip basname title line
				scan.nextLine(); // skip the title underline
			}
			File graphFile = null;
			while (scan.hasNextLine()) {
				// opening and parsing one file at a time 
				graphFile = new File(scan.nextLine() + ".txt");
				Scanner graphScan = new Scanner(graphFile);
				Graph g = null;
				MSTPrim mst = null;
				ShortestPathDijkstra sp = null;
				
				// 1. first line of graph file
				while (graphScan.hasNextLine()) {  
					int n = Integer.parseInt(graphScan.next()); // vertex count 
					int m = Integer.parseInt(graphScan.next()); // edge count 
					graphScan.next(); // skip the "U" token 
					g = new Graph(n, m); 
				}
				
				// 2. read and parse rest of graph - adding edges and perform calculations 
				while (graphScan.hasNextLine()) {
					// parse each line - could be edge or just the start vertex 
					Vertex a = new Vertex(graphScan.next());
					
					if (graphScan.hasNext()) { // edge line 
						Vertex b = new Vertex(graphScan.next());
						int weight = Integer.parseInt(graphScan.next());
						Edge e = new Edge(a, b, weight);
						g.add(e);
						
						if (!graphScan.hasNext()) { // MST without the last source vertex line in file 
							mst = new MSTPrim(g);
							break;
						}
					} else { // last line with source vertex 
						sp = new ShortestPathDijkstra(g, a); // a is the start vertex as we just parsed the last line
						mst = new MSTPrim(g); // MST with source vertex line in file 
						break;
					}
				}
				graphScan.close(); // free file scanner for current graph 
				
				// calculate and display the shortest path and MST 
				
			}

			scan.close(); // free scanner for file index 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
