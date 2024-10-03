package java_logics.logics;

import java.util.HashSet;
import java.util.Set;

public class Print_Duplicate_charcters {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 3, 1, 1};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) 
        {
            if (!set.add(num))
            {
                System.out.println("Duplicate element: " + num);
            }
        }
    }

}
