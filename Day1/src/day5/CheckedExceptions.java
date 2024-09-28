package day5;

import java.io.File;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try
        {
            File f1 = new File("Datat.txt");
            if(!f1.exists())
                throw new IOException("File is not present in the system ");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
