package com.swarup;

public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
    
	
    }

__________________________________________________________________________
  package com.swarup;

public class Person {
    private String name;
    private MyDate dateOfBirth;

    public Person(String name, MyDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name= " + name + ", dateOfBirth=" + dateOfBirth + "]";
	}

}

_________________________________________________________________________________
  package com.swarup;

public class Employee extends Person {
    private int id;
    private String department;
    private double salary;
    private MyDate dateOfJoining;

    public Employee(String name, MyDate dob, int id, String department, double salary, MyDate doj) {
        super(name, dob);
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = doj;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [name = " +getName() +"\nDOB= " +getDateOfBirth()+ "\nid= " + id + ", \ndepartment= " + department + ", \\nsalary= " + salary + ", \ndateOfJoining= \n"
				+ dateOfJoining + "]";
	}

   
}

____________________________________________________________________________________________
  package com.swarup;

import java.util.Scanner;

public class EMS {
	private static final int MAX_EMPLOYEES=10;
	private static Employee[] employees=new Employee[MAX_EMPLOYEES];
	public static int count =0;
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n----Employeee Management System Menu");
			System.out.println("1.Add Employee");
			System.out.println("2.Display All Employee");
			System.out.println("3.Search Employee by ID");
			System.out.println("4.Display Employees joined in given Year");
			System.out.println("5.Find Employee with Maximum Salary:");
			System.out.println("6.Find Employee with Minimum Salary:");
			System.out.println("7.Exit ");
			System.out.println("Enter Choice :");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				addEmployee(sc);
				break;
			case 2:
				displayAllEmployee();
				break;
			case 3:
				searchByID(sc);
				break;
			case 4:
				displayByJoiningYear(sc);
				break;
            case 5 :
            	findMaxSalary();
            	break;
            case 6:
            	findMinSalary();
            	break;
            case 7:
            	System.out.println("Exit the Application");
				 break;
				default:
					System.out.println("Invalid choice ");
			}
		}while(choice!=7);
		sc.close();
		
		
		

	}
	private static void addEmployee(Scanner sc) {
        if (count >= MAX_EMPLOYEES) {
            System.out.println("Maximum employee limit reached.");
           return;
        }

        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date of Birth: ");
        System.out.print("Enter Day :");
        int dd = sc.nextInt();
        System.out.print("Enter Month :");
        int mm = sc.nextInt();
        System.out.print("Enter Year :");
        int yy = sc.nextInt();
        MyDate dob = new MyDate(dd, mm, yy);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Date of joining: ");
        System.out.print("Enter Day :");
        int dojDay = sc.nextInt();
        System.out.print("Enter Month :");
        int dojMonth = sc.nextInt();
        System.out.print("Enter year :");
        int dojYear = sc.nextInt();
        MyDate doj = new MyDate(dojDay, dojMonth, dojYear);

        employees[count++] = new Employee(name, dob, id, dept, salary, doj);
        System.out.println("Employee added successfully!");
    }
	private static void displayAllEmployee() {
		if(count==0) {
			System.out.println("No Employee Information ");
		}
		for(int i =0;i<count;i++) {
			System.out.println(employees[i].toString());
		}
	}
	
	
	private static void searchByID(Scanner sc) {
		System.out.println("Enter id to search");
		int id =sc.nextInt();
		for(int i=0;i<count;i++) {
			if(employees[i].getId()==id) {
				System.out.println(employees[i]);
				return;
			}
		}	
		System.out.println("Employee not Found");
		
	}
	
	private static void displayByJoiningYear(Scanner sc) {
		System.out.println("Enter year");
		int year=sc.nextInt();
		boolean found = false;
		for(int i=0;i<count;i++) {
			if(employees[i].getDateOfJoining().getYear()==year) {
				System.out.println(employees[i]);
				found=true;
				
			}
		}
		if(!found) {
		System.out.println("Employee Not Found");
		}	
	}
	
	private static void findMaxSalary() {
		if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        Employee maxSal = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() > maxSal.getSalary()) {
                maxSal = employees[i];
            }
        }
        System.out.println("Employee with Maximum Salary:");
        System.out.println(maxSal);
		
		
	}
	private static void findMinSalary() {
		if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        Employee minSal = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() < minSal.getSalary()) {
                minSal = employees[i];
            }
        }
        System.out.println("Employee with Minimum Salary:");
        System.out.println(minSal);
		
	}
}

