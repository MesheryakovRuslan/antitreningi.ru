package lesson10.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        String filePath = "src\\lesson10\\file.txt";

        try(OutputStream output = new FileOutputStream(filePath);
            InputStream input = new FileInputStream(filePath);) {

            char[] symbols = {'a', 'b', 'c'};
            for (char symbol: symbols) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }

            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
