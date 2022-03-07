import java.net.*;
import java.io.*;
import java.util.*;

public class newClient {

    public static void main (String [] args) throws IOException {
        int port = 8000;
        Socket s = new Socket ("localhost", port);

        // Read input from the server and print
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        //Display menu
        System.out.println("1: Date and Time\n2: Uptime\n3: Memory Use\n4: Netstat" +
                "\n5: Current Users\n6:Running Processes\nSelect an option:");

        Scanner ui = new Scanner(System.in);
        int userChoice = ui.nextInt();
        ui.close();

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(userChoice);
        pr.flush();

        String str = br.readLine();
        System.out.println("Server: " + str);
    }
}
