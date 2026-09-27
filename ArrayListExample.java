package Sample_Programs;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{
	//1. List is a interface, Having collection of similar items
	//2. To separate into similar items we use generics "<String>"
	//3. It will maintain order
	
	public void ListExample()
	{
	List <String> arrayList = new ArrayList<String>(); // Empty List is created.
	arrayList.add("Sowndharya");
	arrayList.add("Guru");
	arrayList.add("Kishore");
	arrayList.add("Riya");
	arrayList.add("Jeevan");
	arrayList.add("Sowndharya");
	System.out.println(arrayList);
	}

	public static void main(String[] args) {
	

	}

}
