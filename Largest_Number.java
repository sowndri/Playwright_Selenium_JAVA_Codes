package test;

import java.util.Arrays;

public class Largest_number {

	public static void main(String[] args) {

		 int[] array = {10, 20, 30, 40, 50};

	        Arrays.sort(array);

	        if (array.length < 2)
	        {
	            System.out.println("There is no second largest number");
	            
	        } 
	        else 
	        {
	            System.out.println("The second largest number is: " + array[array.length - 2]);
	        }



	}








}


