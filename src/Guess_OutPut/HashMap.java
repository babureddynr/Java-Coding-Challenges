package Guess_OutPut;

import java.util.Map;

public class HashMap {
public static void main(String[] args) {
	Map<Integer, String> map = new java.util.HashMap<>();
	
	map.put(1, "A");
	map.put(2, "b");
	map.put(3, "c");
	map.put(4, "d");
	map.put(5, "e");
	for(String value: map.values())
	{
		System.out.print(value+" ");
	}
	
	 if (map.containsKey("A")) {
         System.out.println("HashMap contains key 'apple'.");
     }

     // Loop through the HashMap and print key-value pairs
     System.out.println("Key-Value pairs in HashMap:");
     for (Integer key : map.keySet()) {
         System.out.println("Key: " + key + ", Value: " + map.get(key));
     }
}
}