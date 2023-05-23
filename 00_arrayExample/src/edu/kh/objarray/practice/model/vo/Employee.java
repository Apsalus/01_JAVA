package edu.kh.objarray.practice.model.vo;

public class Employee {

	private int employeeNO;       // 사번
	private String name;          // 이름
	private String Department;    // 부서
	private String rank;          // 직급
	private int money;            // 급여
	
	
	public Employee(int employeeNO, String name, String department, String rank, int money) {
		this.employeeNO = employeeNO;
		this.name = name;
		this.Department = department;
		this.rank = rank;
		this.money = money;
	}


	public int getEmployeeNO() {
		return employeeNO;
	}


	public void setEmployeeNO(int employeeNO) {
		this.employeeNO = employeeNO;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "사번 : " + employeeNO + ", " + "이름 : " + name + ", " + "부서 : " + Department + ", " +
				"직급 : " + rank + ", " + "급여 : " + money + "\n";
	}
	
	
}
