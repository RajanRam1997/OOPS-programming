
public class TestEmployee {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.setEmpid(1001);
		e1.setName("Laddu kumar singh");
		e1.setSalary(5000);
		e1.setAdd("pune kothrud");
		e1.setEmail("jinishram13@gmail.com");
		
		System.out.println("Employee id:"+e1.getEmpid());
		System.out.println("Employee Name:"+e1.getName());
		System.out.println("Employee Salary:"+e1.getSalary());
		System.out.println("Employee Add:"+e1.getAdd());
		System.out.println("Employee Email:"+e1.getEmail());
	}
}
