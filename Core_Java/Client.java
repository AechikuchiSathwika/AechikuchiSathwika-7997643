import java.io.*;
import java.net.*;
class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);
            BufferedReader br =
                new BufferedReader(
                    new InputStreamReader(s.getInputStream())
                );
            PrintWriter pw =
                new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello Server! Welcome!!");
            String msg = br.readLine();
            System.out.println("Server: " + msg);
            s.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}