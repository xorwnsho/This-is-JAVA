package collection.sec05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Treee2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        descendingScores.add(10);
        descendingScores.add(20);
        descendingScores.add(15);

        for (Integer s : descendingScores) {
            System.out.println(s + " ");
        }
    }
}
