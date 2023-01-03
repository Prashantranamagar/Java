package UDPSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress ip=InetAddress.getLocalHost();
        byte buff[] = null;
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        buff = scanner.nextLine().getBytes();
        DatagramPacket datagramPacket =
                new DatagramPacket(buff, buff.length, ip, 8000);
        datagramSocket.send(datagramPacket);
    }
}
