package game;

import game.gui.GameWindow;
import game.gui.Window;

public abstract class Game {
	
	public static final int PORT = 44444; 
	
	public static final int WIDTH = 600, HEIGHT = 600; 
	public static final int FIELD_WIDTH = WIDTH / 3, FIELD_HEIGHT = HEIGHT / 3; 
	
	public static final int FREE = 0, FIRST_PLAYER = 1, SECOND_PLAYER = 2;
	private int[][] fields; 
	
	private Window window; 
	private GameWindow gameWindow; 
	
	public Game() { 
		window = new Window(this, "Tic Tac Toe", WIDTH, HEIGHT); 
		gameWindow = new GameWindow(this);
		fields = new int[3][3]; 
		fields[0][0] = FIRST_PLAYER; 
		window.add(gameWindow);
	}
	
	
	
	public abstract void inputReceived(int x, int y); 
	public abstract void packetReceived(Object object);
	
	public abstract void close();
	
	public int[][] getFields(){
		return fields; 
	}
	
	
	
}
