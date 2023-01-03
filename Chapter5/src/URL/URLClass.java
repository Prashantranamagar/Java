package URL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLClass {
    public static void main(String[] args) throws MalformedURLException {
        URL sampleUrl = new URL("http://example.com:80/docs" +
                "/books/tutorial/index.html?name=networking#DOWNLOADING");
        System.out.println("protocol = "+ sampleUrl.getProtocol());
        System.out.println("authority =" + sampleUrl.getAuthority());
        System.out.println("host = " + sampleUrl.getHost());
        System.out.println("port = " + sampleUrl.getPort());
        System.out.println("path = " + sampleUrl.getPath());
        System.out.println("query = " + sampleUrl.getQuery());
        System.out.println("filename = " + sampleUrl.getFile());
        System.out.println("ref = " + sampleUrl.getRef());
    }
}
