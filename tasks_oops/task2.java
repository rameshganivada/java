package tasks_oops;

class Employee 
{
	static int count=0;
	String name;


 Employee (String name)
{
	this.name = name;
	count++;
}

void employee_name()
{
	System.out.println("Employee name:"+ name);
}

static void totalCount()
{
	System.out.println("total employees "+count);
}
}
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee E1 = new Employee("sai");
        Employee E2 = new Employee("sri");
        E1.employee_name();
        E2.employee_name();
        Employee.totalCount();
        
	}

}
