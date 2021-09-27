package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Collection {

    public static void main(String[] args) throws CollectionSizeException {
        int size = 0;
        System.out.println("Enter size: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("Enter correct size");
            input.next();
        }
        size = input.nextInt();
        if (size <= 0) {
            throw new CollectionSizeException("Size must be > 0");
        }
        Set<Integer> inputSet = new HashSet<>(size);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            while (!input.hasNextInt()) {
                System.out.println("It`s not a number");
                input.next();
            }
            inputSet.add(input.nextInt());
        }
        Iterator<Integer> iterator = inputSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("MaxElement is :" + inputSet.stream()
                .max(Integer::compare)
                .get());

        System.out.println("sum :" + inputSet.stream()
                .mapToInt(Integer::intValue)
                .filter(x -> x % 2 == 0)
                .sum());

        System.out.println("revers :");
        Stream<Integer> revers = inputSet.stream()
                .sorted(Collections.reverseOrder());
        Iterator<Integer> reversIterator = revers.iterator();
        while (reversIterator.hasNext()) {
            System.out.println(reversIterator.next());
        }
    }
}
