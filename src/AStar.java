import ia.battle.camp.MazeGenerator;

import java.util.ArrayList;

public class AStar {

	private int[][] map;
	private ArrayList<Node> nodes, path;
	private ArrayList<Node> closedNodes, openedNodes;
	private Node origin, destination;

	public AStar(int width, int height) {
		MazeGenerator mg = new MazeGenerator((width - 1) / 4, (height - 1) / 2);
		map = mg.getMaze();
	}

	public void findPath(int x1, int y1, int x2, int y2) {
		nodes = new ArrayList<Node>();
		closedNodes = new ArrayList<Node>();
		openedNodes = new ArrayList<Node>();

		// A node is added for each passable cell in the map
		for (int i = 0; i < map.length; i++)
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0)
					nodes.add(new Node(i, j));
			}

		origin = nodes.get(nodes.indexOf(new Node(x1, y1)));
		destination = nodes.get(nodes.indexOf(new Node(x2, y2)));
		
		
		processNode(origin);
		
		//Build path
		
		
		
	}

	private void processNode(Node node) {
		
		
		
		
	}

	private ArrayList<Node> getAdjacentNodes(Node node) {
		ArrayList<Node> adj = new ArrayList<Node>();

		
		
		
		
		return adj;
	}

	public void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++)
				System.out.print(map[i][j] == 1 ? "XX" : "  ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		AStar a = new AStar(40, 40);
		a.printMap();
		
		
		
	}

}
