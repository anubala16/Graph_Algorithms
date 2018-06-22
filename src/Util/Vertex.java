package Util;

/**
 * 
 * 
 * @author ashah
 * @author abalaji
 *
 */
public class Vertex implements Comparable<Vertex> {

	private String name;
	private Vertex parent; 
	private int distance;

	public Vertex(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parent
	 */
	public Vertex getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Vertex parent) {
		this.parent = parent;
	}

	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Vertex v) {
		return name.compareTo(v.getName());
	}
	
}
