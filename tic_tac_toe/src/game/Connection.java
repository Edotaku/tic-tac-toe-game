package game;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection {
	private ObjectOutputStream outputStream; 
	private ObjectInputStream inputStream;
	
	private boolean running; 
	
	private Game game; 
	
	public Connection(Game game, Socket socket) {
		this.game = game;
		try {
			outputStream = new ObjectOutputStream(socket.getOutputStream());
			inputStream = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		new Thread ().start();
	}
	public void run() {
		running = true; 
		while(running) {
			 try {
				Object object = inputStream.readObject();
				game.packetReceived(object);
			 } catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void sendPacket(Object object) {
		
	}
	public void close() throws IOException {
		running = false; 
		inputStream.close(); 
		outputStream.close(); 
	}
}
