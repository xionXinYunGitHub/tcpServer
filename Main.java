import java.util.*;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("服务器开始运行!");
		TcpServer tcp = new TcpServer();
		try
	{
	   tcp.startserver();
	}
catch (IOException e) {}
    }
	
	
}
