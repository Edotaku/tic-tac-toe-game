package game;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerGame extends Game{
	private ServerSocket serverSocket;
	private Socket socket; 
	
	private Connection connection; 
	
	public ServerGame() {
		try {
			serverSocket = new ServerSocket(Game.PORT);
			socket = serverSocket.accept(); 
			connection = new Connection(this, socket);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	@Override
	public void inputReceived(int x, int y) {
		
	}

	@Override
	public void packetReceived(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
