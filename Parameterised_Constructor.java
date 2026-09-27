package Sample_Programs;

public class Parameterised_Constructor 
{
	//Declaring the data members

	String Emp_Name;
	int Emp_id;
	double Emp_Salary;

	// Initialising the parameterised constructors
	Parameterised_Constructor(String name, int id, double salary)
	{
		Emp_Name= name;

		Emp_id =id;

		Emp_Salary= salary; // Assigning the values

	}
	public void details()
	{
		System.out.println("name:" +Emp_Name);
	}
	public static void main(String[] args) 
	{
		Parameterised_Constructor obj = new Parameterised_Constructor("Guru", 123, 1000.00);
		obj.details();
	}

}
