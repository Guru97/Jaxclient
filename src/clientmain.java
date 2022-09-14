import employee.implement.Employee;
import employee.implement.Employeeimp;
import employee.implement.EmployeeimpService;

public class clientmain 
{
	public static void main(String args[])
	{
		Employeeimp webser =	new EmployeeimpService().getEmployeeimpPort();
		Employee emp=webser.getDetails(1);
		System.out.println(emp.toString());
	}

}
