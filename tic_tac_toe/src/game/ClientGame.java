package game;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientGame extends Game{

	private Socket socket; 
	
	private Connection connection; 
	
	public ClientGame() {
		try {
			socket = new Socket("localhost", Game.PORT);
			connection = new Connection(this, socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void inputReceived(int x, int y) {
		
	}
	public void packetReceived(Object object) {
		 
	}

	@Override
	public void close() {
		try {
			connection.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
