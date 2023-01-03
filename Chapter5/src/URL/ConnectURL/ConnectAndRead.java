package URL.ConnectURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectAndRead {
    public static void main(String[] args) {
        try {
            URL google = new URL("http://www.google.com");
            URLConnection urlConnection = google.openConnection();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            urlConnection.getInputStream()));
            String inputLine;
            while((inputLine = bufferedReader.readLine()) != null){
                System.out.println(inputLine);
            }
            bufferedReader.close();

        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }

    catch (IOException e){
            e.printStackTrace();
    }

    }
}
