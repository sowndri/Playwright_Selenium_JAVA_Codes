package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Voting_eligibity {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Sowndharya", 21);
		map.put("Sasi", 18);
		map.put("Dharani", 17);
		map.put("Dhanesh", 45);
		map.put("fazil", 15);

		System.out.println("The members list were" + map.entrySet());

		map.entrySet().stream().filter(entry ->entry.getValue()>18)
		.forEach(entry ->System.out.println(entry.getKey() +""+entry.getValue()));
		
		
		
	}

}
