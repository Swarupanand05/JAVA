class Person
{
	private String name;
	private String birthdate;
	private double height;
	private double weight;
	private String address;
	Person(String nm,String b,double h,double w,String a)
	{
		this.name=nm;
		this.birthdate=b;
		this.height=h;
		this.weight=w;
		this.address=a;
	}
	public void displayRecord()
	{
		System.out.println("Name:"+name);
		System.out.println("Birth date:"+birthdate);
		System.out.println("Height:"+height+" cm");
		System.out.println("Weight:"+weight+" kg");
		System.out.println("Address:"+address);
	}
}
class Student extends Person
{
	private int rollnum;
	private double[] marks;
	Student(String nm,String b,double h,double w,String a,int r,double[] m)
	{
		super(nm,b,h,w,a);
		this.rollnum=r;
		this.marks=m;
	}
	public double calculateAvg()
	{
		//calclateAvg(double[] m:marks);
		double sum=0;
		for(double m:marks)
		{
			sum+=m;
		}
		return sum/marks.length;
	}
	public void displayStudent()
	{
		displayRecord();
		System.out.println("Roll Number is:"+rollnum);
		System.out.println("Average is:"+calculateAvg());
	}
}
class Employee extends Person
{
	private int empid;
	private double salary;
	Employee(String nm,String b,double h,double w,String a,int e,double s)
	{
		super(nm,b,h,w,a);
		this.empid=e;
		this.salary=s;
	}
	public double calculateTax()
	{
		if(salary>50000)
		{
			return salary*0.10;
		}
		else
		{
			return salary*0.05;
		}
	}
	public void displayEmployee()
	{
		displayRecord();
		System.out.println("Employee id is:"+empid);
		System.out.println("Salary of the employee is:"+salary);
		System.out.println("The tax of the employee is:"+calculateTax());
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
	Person p=new Person("Rutuja","2nov",4,50,"Umed nagar kupwad,sangli");
		p.displayRecord();
		double[] marks= {85,90,78,70};
		Student s=new Student("Rutuja","2 november",170,50,"Umed nagar kupwad,sangli",21,marks);
		s.displayStudent();
		Employee emp=new Employee("Revati","20 oct",180,40,"Pashan road,pune",10,80000.00);
		emp.displayEmployee();
	}
}
