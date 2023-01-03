package UDPSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8000);
        byte[] receive = new byte[65507];

        DatagramPacket datagramPacket = new DatagramPacket(receive, receive.length);
        datagramSocket.receive(datagramPacket);

        String message = "";
        int i = 0;
        while (receive[i] !=0){
            message += (char)receive[i];
            i++;
        }
        System.out.println(message);
    }
}
