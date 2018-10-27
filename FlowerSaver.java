package Homework5to3;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FlowerSaver {

    public FlowerSaver() {

    }

    public static void save(ArrayList<Flowers> flowers) throws IOException {

        PrintWriter printWriter = new PrintWriter(new FileWriter( "./src/Homework5to3/SaveTest"));

        printWriter.println();
        for (Flowers flower : flowers)
        {
           printWriter.println(flower.getStingRepresentation());
        }
        printWriter.close();


    }
}


