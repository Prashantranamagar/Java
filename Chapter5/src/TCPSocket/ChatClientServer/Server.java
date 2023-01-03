package TCPSocket.ChatClientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server Started");
        System.out.println("Waiting for client");
        Socket socket = serverSocket.accept();

//        initialize Input Stream And Output Stream
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        Scanner scanner = new Scanner(System.in);
        String line = "";

        while(!line.equals("over")){
//            receive from client
            line = dataInputStream.readUTF();
            System.out.println("Message From Client::: "+line);

//            write to client
            System.out.println("Enter Your Message: ");
            line = scanner.nextLine();
            dataOutputStream.writeUTF(line);
        }

        System.out.println("Closing Connection ");

        dataInputStream.close();
        serverSocket.close();


    }
}
