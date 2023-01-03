package TCPSocket.HalfClose;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);

        System.out.println("Waiting for Client");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        System.out.println(dataInputStream.readUTF());

        dataOutputStream.writeUTF("I am sending you data thanks" +
                "\n Here is data :::::::::::");
    }
}
