package collection.sec05;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit f1, Fruit f2) {
        if(f1.price < f2.price) return -1;
        else if(f1.price > f2.price) return 1;
        else return 0;
    }
}
