package test2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileImplementation {
    public void nothing(){
        try {
            FileWriter fileWriter = new FileWriter("123");
//            fileWriter.write();
            fileWriter.flush();
        } catch (IOException ioe) {
            System.err.println(ioe);
            ioe.printStackTrace();
        }
    }
}
