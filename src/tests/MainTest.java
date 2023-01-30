package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.Main;

class MainTest {

    @Test
    void findSmallestWithTwoValues() {
        int result = Main.findSmallestSepatarion(new int[]{1, 9});
        Assertions.assertEquals(result, 7);
    }

    @Test
    void findSmallestWithMinimumAndMaximum() {
        int result = Main.findSmallestSepatarion(new int[]{0, Integer.MAX_VALUE});
        Assertions.assertEquals(result, 2147483646);
    }

    @Test
    void findSmallestWithConstantFrequency() {
        int result = Main.findSmallestSepatarion(new int[]{1, 3, 5, 7, 9});
        Assertions.assertEquals(result, 1);
    }

    @Test
    void returnZeroWithSingleValue() {
        int result = Main.findSmallestSepatarion(new int[]{7});
        Assertions.assertEquals(result, 0);

        result = Main.findSmallestSepatarion(new int[]{7, 7, 7, 7, 7, 7, 7, 7});
        Assertions.assertEquals(result, 0);
    }

    @Test
    void duplicatesAreTreatedAsASingleValue() {
        int result = Main.findSmallestSepatarion(new int[]{4, 7, 4, 7});
        Assertions.assertEquals(result, 2);
    }

    @Test
    void orderOfInputDoesNotMatter() {
        int result = Main.findSmallestSepatarion(new int[]{5, 10, 1});
        Assertions.assertEquals(result, 3);

        result = Main.findSmallestSepatarion(new int[]{1, 5, 10});
        Assertions.assertEquals(result, 3);
    }
}