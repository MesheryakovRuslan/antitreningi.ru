package lesson10.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileIn = new FileInputStream("src\\lesson10\\file.txt");
        FileOutputStream fileOut = new FileOutputStream("src\\lesson10\\copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
