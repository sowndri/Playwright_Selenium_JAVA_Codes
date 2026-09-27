package Sample_Programs;

public class ReverseString 
{

	//String is immutable in JAVA, bcz the assigned variable can't be changed.
	// So we are going for string builder and string buffer.

	public static void main(String[] args) 

	{
		String var = "Sowndharya";
		StringBuffer buffer = new StringBuffer();
		buffer.append(var);

		StringBuffer reversed = buffer.reverse();
		System.out.println("The reversed string is :" +reversed);

	}
}
