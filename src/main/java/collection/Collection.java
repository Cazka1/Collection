package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collection {

    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        List<Integer> inputList = new ArrayList<>(size);
        Set<Integer> inputSet = new HashSet<>(size);
        System.out.println("Enter elements:");
        Set<Integer> set = inputUniqeData(input, size, inputSet);
        printData(set);
        System.out.println("Enter next elements: ");
        Set<Integer> set1 = getUniqeValues(input, size, inputList);
        printData(set1);
    }

    private static Set<Integer> getUniqeValues(Scanner input, int size, List<Integer> inputList) {
        try {
            for (int i = 0; i < size; i++) {
                inputList.add(input.nextInt());
            }
        } catch (InputMismatchException e) {
            System.out.printf("it`s not a number");
        }
        Set<Integer> set = new HashSet<>(inputList);
        return set;
    }

    private static Set<Integer> inputUniqeData(Scanner input, int size, Set<Integer> inputSet) {
        try {
            for (int i = 0; i < size; i++) {
                if (!inputSet.add(input.nextInt())) {
                    size++;
                    System.out.println("write next number");
                }
            }
        } catch (InputMismatchException e) {
            System.out.printf("it`s not a number");
        }
        return inputSet;
    }

    private static void printData(Set<Integer> inputSet) {
        Iterator<Integer> iterator = inputSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
