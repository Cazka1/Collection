package collection;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collection {

    public static void main(String[] args) {
        int size = 0;
        System.out.println("Enter size: ");
        Scanner input = new Scanner(System.in);
        try {
            size = input.nextInt();
        } catch (InputMismatchException x) {
            System.out.println("Enter correct size");
            return;
        }
        Set<Integer> inputSet = new HashSet<>(size);
        System.out.println("Enter elements:");
        try {
            for (int i = 0; i < size; i++) {
                inputSet.add(input.nextInt());
            }
        } catch (InputMismatchException e) {
         System.out.println("it`s not a number");
         return;
        }
        Iterator<Integer> iterator = inputSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}