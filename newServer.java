import java.io.*;
import java.util.*;
import java.net.*;

public class newServer {

    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerSocket server = new ServerSocket(port);

        System.out.println("Server is listening on port " + port);
        System.out.println("Waiting for client connection...");

        Socket s = server.accept();

        System.out.println("Client connected");

//        // Send outgoing message
        PrintWriter pr = new PrintWriter(s.getOutputStream());
//        pr.println("hello from server");
//        pr.flush();

        // Read input from the client
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);

        int userChoice = Integer.parseInt(br.readLine());
        System.out.println("Client choice: " + userChoice);

        switch (userChoice) {

            case 1:
//                pr.println(new Date().toString());
                pr.println("Hello");
                break;
            default:
                pr.println("Invalid input");
                break;
        }
        pr.flush();

        s.close();
    }
}
