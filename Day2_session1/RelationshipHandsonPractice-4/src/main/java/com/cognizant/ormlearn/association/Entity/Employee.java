package com.cognizant.ormlearn.association.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;

@Entity
public class Employee {
	
	@TableGenerator(name="employee_gen", table="id_gen", pkColumnName="gen_name", valueColumnName="gen_num", allocationSize=100)
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="employee_gen")
	@Column(name="emp_id")
	private int id;

	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_salary", columnDefinition="Decimal(10,2)")
	private double salary;
	
	@Column(name="emp_permanent")
	private boolean permanent;
	
	@Column(name="emp_date_of_birth")
	private Date dateOfBirth;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="employees_skills",
	joinColumns=@JoinColumn(name="emp_id", referencedColumnName = "emp_id"),
	inverseJoinColumns = @JoinColumn(name="skill_id", referencedColumnName = "sk_id"))
	private List<Skill> skills;
	
	
	
	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

}
