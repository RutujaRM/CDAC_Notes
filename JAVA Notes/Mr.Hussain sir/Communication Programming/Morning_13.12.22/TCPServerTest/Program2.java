import java.io.*;
import java.net.*;

class Program {

	public static void main(String[] args) throws Exception {
		var listener = new ServerSocket(5000);
		service(listener);
	}

	private static void service(ServerSocket listener) throws IOException {
		Shop shop = Shop.open("CitiTek.xml");
		for(;;) {
			var client = listener.accept();
			client.setSoTimeout(20000);
			var input = client.getInputStream();
			var output = client.getOutputStream();
			var reader = new BufferedReader(new InputStreamReader(input));
			var writer = new PrintWriter(new OutputStreamWriter(output), true);
			try{
				writer.println("Welcome to CitiTek");
				String item = reader.readLine();
				String info = shop.getItemInfo(item);
				if(info != null)
					writer.println(info);
			}catch(Exception e){}
			writer.close();
			reader.close();
			client.close();
		}	
	}
}
	
