package game.res;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Resources {
	
	public static BufferedImage[] images; 
	
	static {
		images = new BufferedImage[2]; 
		images[0] = loadImage("C:\\Users\\Lenovo\\eclipse-workspace\\tic_tac_toe\\resources\\x.png");
		images[1] = loadImage("C:\\Users\\Lenovo\\eclipse-workspace\\tic_tac_toe\\resources\\o.png"); 
	}
	
	private static BufferedImage loadImage(String path) {
		try{
			return ImageIO.read(Class.class.getResource(path));
		}catch(IOException e) {
			e.printStackTrace(); 
			System.exit(-1);
		}
		return null; 
	}
}
