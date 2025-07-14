package test;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		int[] array = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the search item");

		int searchitem = scanner.nextInt();

		boolean found = false;
		for(int i=0; i<=array.length-1;i++)
		{
			if(array[i]==searchitem)
			{
				System.out.println(i);
				found = true;
			}
		}
		

		if(!found)
		{
			System.out.println("Not found");
		}



	}

}
