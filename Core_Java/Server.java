import java.io.*;
import java.net.*;
class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting...");
            Socket s = ss.accept();
            System.out.println("Client connected");
            BufferedReader br =
                new BufferedReader(
                    new InputStreamReader(s.getInputStream())
                );
            PrintWriter pw =
                new PrintWriter(s.getOutputStream(), true);
            String msg = br.readLine();
            System.out.println("Client: " + msg);
            pw.println("Hello Client! Welcome!!");
            s.close();
            ss.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}