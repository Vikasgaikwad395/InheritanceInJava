
class Employee{
		void getemployeeName() {
			System.out.println("This a Employee Name ");
		}
		void getEmployeeId() {
			System.out.println("This EmployeeID");
		}
}

class PermenantEmployee extends Employee {
		void salaryOnMonth() {
			System.out.println("This is the Permenant Employee");
			System.out.println("=====================\n");
		}
}
class contractEmployee extends Employee {
	void SalaryPerHour() {
		System.out.println("This is the contract base Employee");
		System.out.println("=====================\n");
	}
	
}

public class HierachicalInheritance {

	public static void main(String[] args) {
				
		PermenantEmployee p = new PermenantEmployee();
		p.getemployeeName();
		p.getEmployeeId();
		p.salaryOnMonth();
	
		
		contractEmployee c = new contractEmployee();
		c.getemployeeName();
		c.getEmployeeId();
		c.SalaryPerHour();
	}

}
