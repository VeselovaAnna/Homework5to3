package Homework5to3;

public class Roses extends Flowers {
    public Roses() {price=100;}

    @Override
    public String toString() {
        return "Роза";
    }

    @Override
    public String getStingRepresentation() {
        return "rose";
    }

    public int getPrice(){
        return price;
    }
}
