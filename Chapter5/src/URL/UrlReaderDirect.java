package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlReaderDirect {
    public static void main(String[] args) throws IOException {
        URL google = new URL("https://google.com");
        BufferedReader bufferReader =
                new BufferedReader(new
                        InputStreamReader(google.openStream()));

                String inputLine;
                while ((inputLine = bufferReader.readLine()) != null){
                    System.out.println(inputLine);
                }
                bufferReader.close();
    }
}
