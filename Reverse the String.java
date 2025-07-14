package test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_03 {

	public static void main(String[] args) 
	{
		String str = "Testing is complete";
		String[] total = str.split(" ");
		String result = "";

		for (int i = 0; i < total.length; i++) 
		{
			String word = total[i];
			String reversed = " ";

			// Reverse each word using a simple for loop
			for (int j = word.length() - 1; j >= 0; j--)
			{
				reversed += word.charAt(j);
			}

			result += reversed + " ";
		}

		System.out.println(result);
	}


}
