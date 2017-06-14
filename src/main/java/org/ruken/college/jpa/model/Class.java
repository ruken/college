package org.ruken.college.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the classes database table.
 * 
 */
@Entity
@Table(name="classes")
@NamedQuery(name="Class.findAll", query="SELECT c FROM Class c")
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String price;

	@Column(name="student_id")
	private int studentId;

	//bi-directional one-to-one association to Student
	@OneToOne
	@JoinColumn(name="id")
	private Student student;

	public Class() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}