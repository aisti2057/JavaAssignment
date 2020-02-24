package q3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestQ3 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            randomNumbers.add(random.nextInt(1000));
        }

        Collections.sort(randomNumbers);

        System.out.println(findNthSmallest(randomNumbers, 1)); //finds the 1st smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 2)); //finds the 2nd smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 3)); //finds the 3rd smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 100)); //finds the 100th smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 200)); //finds the 200th smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 300)); //finds the 300th smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 400)); //finds the 400th smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 498)); //finds the 499th smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 499)); //finds the 499th smallest integer from the list
        System.out.println(findNthSmallest(randomNumbers, 500)); //finds the 500th smallest integer from the list
    }

    public static int findNthSmallest(List<Integer> list, int n) {
        int nthSmallest = list.get(0);
        try {
            nthSmallest = list.get(n-1);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please enter n where n is less than the size of the list");
            ex.printStackTrace();
        }
        return nthSmallest;
    }

}
