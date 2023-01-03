package TCPSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        //let the server wait for 10 sec.
        serverSocket.setSoTimeout(10000);
        try{
            System.out.println("I am server Waiting for a client at port:"+
                    serverSocket.getLocalPort());
            Socket server = serverSocket.accept();
            System.out.println("I am just connected to client." +
                    server.getRemoteSocketAddress());
            InputStream inputStream = server.getInputStream();
            DataInputStream dataInputStream = (new DataInputStream(inputStream));
            System.out.println("Data Received from Client ::: " +
            dataInputStream.read());
            System.out.println("Radius value received from client :::" +
                    dataInputStream.readDouble());

//            sending data to client
            OutputStream outputStream = server.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello" +
                    "Client I received all data");
        }

        catch (SocketTimeoutException e){
            e.printStackTrace();
        }
    }
}
