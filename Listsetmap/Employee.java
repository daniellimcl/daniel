package daniel;
public class Employee {

	public static void main(String[] args) {
		int empId;
		String empName;
	
		public Employee(int empId, String empName) 
		{
		super();
		this.empId = empId;
		this.empName = empName;
	    }
		public int getEmpId() 
		{
			return empId;
		
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() 
		{
			this.empName = empName;
		}
		 public void setEmpName(String empName) {
			 this.empName = empName;
			
		 }
		 public void display() {
			 
			 System.out.println(Emp Id:"+getEmpId()+" Emp Name: "+getEmpname"());
			 
		 }

	}

}
