package com.javaex.project1;

public class EmploymentVo {
	private Long id;
	private String name;
	private String age;
	private String number;
	private String email;
	private String address;
	private Long departmentId;
	private String employeeRank;
	private Long salary;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmployeeRank() {
		return employeeRank;
	}
	public void setEmployeeRank(String employeeRank) {
		this.employeeRank = employeeRank;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}

	
	public EmploymentVo(String name, String age, String number, String address, Long departmentId, String employeeRank, Long salary) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
		this.departmentId = departmentId;
		this.employeeRank = employeeRank;
		this.salary = salary;
		
	}
	
	public EmploymentVo(String name, String age, String number, String email, String address, Long departmentId, String employeeRank, Long salary) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = email;
		this.address = address;
		this.departmentId = departmentId;
		this.employeeRank = employeeRank;
		this.salary = salary;	
	}
	
	public EmploymentVo(Long id, String name, String age, String number, String email, String address, Long departmentId, String employeeRank, Long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = email;
		this.address = address;
		this.departmentId = departmentId;
		this.employeeRank = employeeRank;
		this.salary = salary;
	}
	
	public EmploymentVo() {
		
	}
	
	
	@Override
	public String toString() {
		return "EmploymentVo [id=" + id + ", name=" + name + ", age=" + age + ", number=" + number + ", email=" + email
				+ ", address=" + address + ", departmentId=" + departmentId + ", employeeRank=" + employeeRank
				+ ", salary=" + salary + "]";
	}

}
