package StudyAndShare;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Unit46 {
    public static void main(String[] args) {
        File file = new File("blog.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            //Do somethings

            String data = "StudyAndShare";
            bw.write(data);
            bw.write(data);
            bw.write(data);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
