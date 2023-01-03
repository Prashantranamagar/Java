package TCPSocket.ChatClientServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static  int port=8000;
    private static  String serverName="192.168.43.125";
    public static void main(String[] args) throws IOException {
        System.out.println("I am Client connecting to port: "
                +port+" server::"+serverName);
        Socket clientSocket = new Socket(serverName,port);

//    initialize input stream and output stream
        OutputStream outputStream = clientSocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        InputStream inputStream = clientSocket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);


        Scanner scanner = new Scanner(System.in);
        String line = "";

        while (!line.equals("over"))
        {
//            write to server
            System.out.println("Enter Your Message :");
            line=scanner.nextLine();
            dataOutputStream.writeUTF(line);
//            read from server
            line = dataInputStream.readUTF();
            System.out.println("Message from server:: "+line);
        }

        dataOutputStream.close();
        clientSocket.close();


    }
}
