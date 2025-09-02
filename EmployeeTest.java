
import java.util.Scanner;
class Employee1
{
	private String first_name;
	private String last_name;
	private double salary;
	private double monthsalary;
	private double raisesal1;
	Employee1()
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.salary=salary;
		this.monthsalary=monthsalary;
		this.raisesal1=raisesal1;
	}
	public void setInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fist name");
		first_name=sc.nextLine();
		System.out.println("Enter last name");
		last_name=sc.nextLine();
		System.out.println("Enter salary");
		salary=sc.nextDouble();
	}
	public void getInfo()
	{
		System.out.println("Name is:"+first_name+"\nLast name is:"+last_name+"\nsalary is:"+salary);
	}
	public void getYearlySal()
	{
		
		monthsalary=salary*12;
		System.out.println("Yearly salary of employee is:"+monthsalary);
	}
	public void raiseSal()
	{
		raisesal1=monthsalary+(monthsalary*0.10)/100;
		System.out.println("Raising salary is:"+raisesal1);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.setInfo();
		e1.getInfo();
		e1.getYearlySal();
		e1.raiseSal();
		
		Employee1 e2=new Employee1();
		e2.setInfo();
		e2.getInfo();
		e2.getYearlySal();
		e2.raiseSal();
		}
}
