
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.IOException;
public class TcpServer {
    public void startserver() throws IOException{

			ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println( serverSocket.getInetAddress().getHostAddress());
			Socket socket = serverSocket.accept();
			InputStream inputs = socket.getInputStream();
			byte[] buff = new byte[2048];
			int len = inputs.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
			socket.close();
			serverSocket.close();
	}
}
