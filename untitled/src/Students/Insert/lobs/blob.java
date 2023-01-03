package Students.Insert.lobs;

import DBConnection.DBConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class blob {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try{
            String sql = "INSERT INTO IMAGES(image) values(?)";
            Connection connection = dbConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement((sql));
            File file = new File("a.jpg");
            Blob blob = connection.createBlob();
            FileInputStream fileInputStream = new FileInputStream(file);
            OutputStream outputStream = blob.setBinaryStream(1);
            int i;
            while ( (i = fileInputStream.read()) != -1)
            {
                outputStream.write(i);
            }
            preparedStatement.setBlob(1, blob);
            preparedStatement.execute();
            System.out.println("Blob file stored");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
