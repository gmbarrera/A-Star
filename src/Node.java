public class Node {
	private float g;
	private float h;
	private Node parent;

	private int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public float getF() {
		return g + h;
	}

	public float getG() {
		return g;
	}

	public void setG(float g) {
		this.g = g;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean equals(Object obj) {
		Node other = (Node)obj;
		
		return this.x == other.getX() && this.y == other.getY();
	}
	
}
