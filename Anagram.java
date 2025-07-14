package test;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {


		String str1 = "tomato";
		String str2 = "matoto";

		int length1=str1.length();
		int length2=str2.length();

		if(length1==length2)
		{
			System.out.println("The string length are equal, Come under validation....!");
		}
		else
		{
			System.out.println("not a anagram");
		}

		char[] arr1 =str1.toCharArray(); // t o m a t o
		char[] arr2 =str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Anagram");  
		}

		else
		{
			System.out.println("NOT Anagram!");
		}
	}

}
