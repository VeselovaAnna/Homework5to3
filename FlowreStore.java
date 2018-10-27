package Homework5to3;

import java.util.ArrayList;

public class FlowreStore {

    public static int money = 0;

    public FlowreStore() {

    }

    public static ArrayList<Flowers> sell(int rose, int chamomile, int tulip) {
        ArrayList<Flowers> flowers = new ArrayList<>();

        for (int i = 0; i < rose; i++) {
            flowers.add(new Roses());
        }
        for (int i = 0; i < chamomile; i++) {
            flowers.add(new Chamomiles());
        }
        for (int i = 0; i < tulip; i++) {
            flowers.add(new Tulips());
        }

        for (Flowers flower : flowers) {
            money = money + flower.getPrice();
        }

        return flowers;
    }

    public static ArrayList<Flowers> sellSequence(int rose, int chamomile, int tulip) {
        ArrayList<Flowers> flowers = new ArrayList<>();

        while (rose + chamomile + tulip > 0) {
            if (rose > 0) {
                flowers.add(new Roses());
                rose--;
            }
            if (chamomile > 0) {
                flowers.add(new Chamomiles());
                chamomile--;
            }
            if (tulip > 0) {
                flowers.add(new Tulips());
                tulip--;
            }
        }

        return flowers;
    }

    public static int purseInShop() {
        ArrayList<Flowers> flowers = new ArrayList<>();
        for (Flowers flower : flowers) {
            money =money + flower.getPrice();
            System.out.println("in purce " + money);

        }
        return money;
    }


}

