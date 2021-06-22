package com.ashwanth.jpa.jpql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Student {

	@TableGenerator(name="student_gen", table="id_gen", pkColumnName="gen_name", valueColumnName="gen_num", allocationSize=100)
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="student_gen" )
	private int id;
	@Column(name="fname")
	private String firstName;
	@Column(name="lname")
	private String lastName;
	private int score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", score=" + score + "]";
	}
}
