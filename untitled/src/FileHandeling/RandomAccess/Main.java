package FileHandeling.RandomAccess;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException{
     File file = new File("new_file.txt");
     File file1 = new File("output.txt");

     RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
     RandomAccessFile randomAccessFile1 = new RandomAccessFile(file, "rw");

     randomAccessFile.seek(20);

     int temp;
     while((temp=randomAccessFile.read())!=1)
     {
         randomAccessFile1.write(temp);
     }
    randomAccessFile.close();
     randomAccessFile1.close();
    }
}
