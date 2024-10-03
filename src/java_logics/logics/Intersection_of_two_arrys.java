package java_logics.logics;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection_of_two_arrys {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        ArrayList<Integer> intersection = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // Add elements of the first array to the set
        for (int num1 : arr1) {
            set.add(num1);
        }

        // Check elements of the second array against the set
        for (int num2 : arr2) {
            if (set.contains(num2)) {
                intersection.add(num2);
                set.remove(num2);  // Remove to avoid duplicates
            }
        }

        System.out.println("Intersection of the two arrays: " + intersection);
    }
}
