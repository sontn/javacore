package SerializeLesson;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person(1);

//        System.out.println(p.getId());

        File file = new File("src/main/java/SerializeLesson/demo.txt");

        if(!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p1 = (Person) objectInputStream.readObject();
        System.out.println(p1.getId());
    }
}
