package TCPSocket.HalfClose;

import java.io.*;
import java.net.Socket;

public class Client {
    private static int port=8000;
    private static String serverName="localhost";

    public static void main(String[] args) throws IOException {
        System.out.println("I am Client connecting to port:"
        + port + "server::"+serverName);
        Socket clientsocket = new Socket(serverName, port);

        OutputStream outputStream = clientsocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        InputStream inputStream = clientsocket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        //send request data
        dataOutputStream.writeUTF("Hey Iam Client Requesting" +
                "You Data!!!");
        clientsocket.shutdownOutput();
        //now socket is HalfClosed, and now we can't write further
        //read response data now from server

        System.out.println(dataInputStream.readUTF());
        clientsocket.close();


    }
}
