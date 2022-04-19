package lesson11.task1;

import java.io.*;

public class SerializableAndDeserialization {
    public static void main(String[] args) {
        String filePath = "src\\lesson11\\task1\\horse.bit";
        writeObject(filePath);
        readObject(filePath);
    }


    public static void writeObject(String filePath) {
        Horse horse = new Horse("brown",7,"Лошадка","Equus caballus",1);

        try(FileOutputStream fos = new FileOutputStream(filePath); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObject(String filePath) {

        try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);){

            Horse horse1 = (Horse)ois.readObject();
            System.out.println(horse1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
