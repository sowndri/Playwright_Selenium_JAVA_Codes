package test;

import java.util.HashMap;
import java.util.Map;

public class char_occurance {

	public static void main(String[] args) {
		
		 char[] arr = {'a', 'b', 'a', 'b', 'c', 'd', 'h'};
		 
		 Map <Character, Integer> map = new HashMap<>();
		 
		 for(char ch : arr)
		 {
			 if(map.containsKey(ch))
			 {
				 map.put(ch, map.get(ch)+1);
			 }
			 else
			 {
				 map.put(ch, 1);
			 }
		 }
		 System.out.println(map.entrySet());	    
	}

}
