package lesson10.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTwo {
    public static void main(String[] args) throws IOException {

        System.out.println("Укажите файл содержимое которого будет скопировано. Пример \"src\\\\lesson10\\\\copied_file.txt\"");
        Scanner originFileScan = new Scanner(System.in);
        String originFileStr = originFileScan.nextLine();

        System.out.println("Укажите файл в который будет скопировано содерживое файла: " + originFileStr);
        Scanner copiedFileScan = new Scanner(System.in);
        String copiedFileStr = copiedFileScan.nextLine();

        try (FileInputStream fileIn = new FileInputStream(originFileStr);
             FileOutputStream fileOut = new FileOutputStream(copiedFileStr)) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
