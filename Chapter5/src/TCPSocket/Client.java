package TCPSocket;

import java.io.*;
import java.net.Socket;

public class Client {
    private  static int port =8000;
    private static String serverName = "localhost";

    public static void main(String[] args) throws IOException {
        System.out.println("I am Client connection to port:"
        +port + "server::"+ serverName);
        Socket clientsocket= new Socket(serverName,port);
        OutputStream outputStream=clientsocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.write(100);
        dataOutputStream.writeDouble(3.14);

        //read form server
        InputStream inputStream = clientsocket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println(dataInputStream.readUTF());
    }
}
