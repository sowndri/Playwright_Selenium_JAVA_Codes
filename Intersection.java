package test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Intersection {

	public static void main(String[] args) {


		String [] arr1 = { "apple" ,"banana","grapes","Mango"}; 
		String [] arr2 = {"apple" ,"banana","jackfruit","pineapple"};
		Set<String> setA = new HashSet<>(Arrays.asList(arr1));
		Set <String> setB= new HashSet<>(Arrays.asList(arr2));
		setA.retainAll(setB); 
		System.out.println(setA);



	}

}
