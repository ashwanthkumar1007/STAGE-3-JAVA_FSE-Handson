package com.ashwanth.jpa.generators.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity(name="employee")
public class Employee {
	@TableGenerator(name="employee_gen", table="id_gen", pkColumnName="gen_name", valueColumnName="gen_num", allocationSize=100)
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="employee_gen")
	private Long id;
	@Column
	private String name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
