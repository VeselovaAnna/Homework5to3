package Homework5to3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        FlowreStore flowreStore = new FlowreStore();

        ArrayList<Flowers> bouquet1 = flowreStore.sell(4, 3, 3);
       for (Flowers flowers:bouquet1){
           System.out.print(flowers + " ");
       }
        System.out.println();


       ArrayList<Flowers> bouquet2 = FlowreStore.sellSequence(3, 3, 3);
        for (Flowers flower:bouquet2){
            System.out.print(flower + " ");
        }
        System.out.println();


       int bank = flowreStore.purseInShop();
       System.out.println(bank);


       FlowerLoader flowerLoader = new FlowerLoader();
       flowerLoader.load();

       FlowerSaver flowerSaver =new FlowerSaver();
      flowerSaver.save(bouquet2);
      flowerSaver.save(bouquet1);


    }


}

   // File saveFile = new File("./src/Homework5to3/SaveTest");
