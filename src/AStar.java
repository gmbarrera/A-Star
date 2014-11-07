import ia.battle.camp.MazeGenerator;

import java.util.ArrayList;


public class AStar {
	
	private int[][] map;
	private ArrayList<Node> nodes;
	
	public AStar(int width, int height) {
		
		nodes = new ArrayList<Node>();
		
		MazeGenerator mg = new MazeGenerator((width - 1) / 4, (height - 1) / 2);
		map = mg.getMaze();
		
		
		
	}
	
	
	
	
}
