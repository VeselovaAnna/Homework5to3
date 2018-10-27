package Homework5to3;

public class Tulips extends Flowers {
    public Tulips(){
        price=45;
    }

    @Override
    public String toString() {
        return "Тюльпан";
    }

    @Override
    public String getStingRepresentation() {
        return "tulip";
    }
}
