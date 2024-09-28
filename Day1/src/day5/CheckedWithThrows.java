package day5;

import java.io.File;
import java.io.IOException;

public class CheckedWithThrows {

    public static void checkFile(String path) throws IOException
    {
        File f = new File(path);
        if(!f.exists())
            throw new IOException("File is not there...");
    }

    public static void main(String[] args) throws IOException {
//        try {
//            checkFile("abc.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        checkFile("abc.txt");

    }
}
