package Sample_Programs;

public class SwapNumbers {

	public static void main(String[] args)
	{
		int Emp1 = 20000;
		int Manager = 50000;

		int temp=Emp1; // temp =20000
		Emp1 =Manager; //Emp1 =50000
		Manager = temp;

		System.out.println("Emp1 salary: " +Emp1);
		System.out.println("Manager salary: " +Manager);
}

}
