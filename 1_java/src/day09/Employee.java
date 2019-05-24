package day09;

public class Employee extends Object{

	private String name;
	private String dept;
	
	public Employee() {
		super();
	}
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
		
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	/*	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Employee)obj).getName() && this.dept == ((Employee)obj).getDept()) {
			return true;
		}
		else return false;

		boolean flag = false;
		if (obj!=null && obj instanceof Employee) {
			Employee temp = (Employee)obj;
			if(this.name == temp.name && this.dept == temp.dept)
				flag = true;
			
		}
		return flag;
	}
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
