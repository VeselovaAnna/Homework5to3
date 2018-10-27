package Homework5to3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FlowerLoader {

    public FlowerLoader() {

    }

    public static ArrayList<Flowers> load() {
        ArrayList<Flowers> flowers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("./src/Homework5to3/test1"));

            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                if (word.equals("rose")) {
                    flowers.add(new Roses());
                }
                if (word.equals("chamomiles")) {
                    flowers.add(new Chamomiles());
                }
                if (word.equals("tulip")) {
                    flowers.add(new Tulips());
                }
            }
            System.out.println("Works" + (flowers));

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");

        }
        return null;
    }

}
