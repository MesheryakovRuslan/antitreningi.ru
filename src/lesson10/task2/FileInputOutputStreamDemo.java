package lesson10.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        try(OutputStream output = new FileOutputStream("src\\lesson10\\file.txt");InputStream input = new FileInputStream("src\\lesson10\\file.txt");) {
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
            System.out.print("Exception");
        }
    }
}
