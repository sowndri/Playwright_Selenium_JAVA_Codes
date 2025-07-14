package test;

import java.util.HashSet;
import java.util.Set;

public class dup_sample {

	public static void main(String[] args) {
		String str = "automation";
		
		char[] arr = str.toCharArray();
		
		StringBuffer buffer = new StringBuffer();
		
		Set<Character> set = new HashSet<>();
		
		for(char ch:arr)
		{
			if(set.add(ch))
			{
				buffer.append(ch);
			}
		}
		
		System.out.println("The final string is: " +buffer.toString());
	}

}
