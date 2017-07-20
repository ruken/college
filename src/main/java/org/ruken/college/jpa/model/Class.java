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

	@Column(name="max_students")
	private int maxStudents;

	private String name;

	private int price;

	@Column(name="student_count")
	private int studentCount;

	public Class() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxStudents() {
		return this.maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStudentCount() {
		return this.studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

}