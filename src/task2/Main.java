package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] table = new int[]{34, 523, 523, 5, 5, 5, 56, 23};
        System.out.println(findSmallestSepatarion(table));
    }

    public static int findSmallestSepatarion(int[] table) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int number : table) {
            treeSet.add(number);
        }

        int smallest = Integer.MAX_VALUE;
        int previous = treeSet.pollFirst();
        int difference;

        for (int current : treeSet) {
            difference = current - previous - 1;
            if (difference < smallest) {
                smallest = difference;
            }
            previous = current;
        }
        if (smallest < 0 || smallest == Integer.MAX_VALUE) {
            smallest = 0;
        }
        return smallest;
    }
}
