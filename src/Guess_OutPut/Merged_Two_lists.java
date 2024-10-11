package Guess_OutPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merged_Two_lists {

	public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(1,2);

	List<Integer> list2 = Arrays.asList(3,4);

	List<Integer> mergedList= new ArrayList<>(list1);
	mergedList.addAll(list2);
	System.out.println(mergedList);
	}

}
