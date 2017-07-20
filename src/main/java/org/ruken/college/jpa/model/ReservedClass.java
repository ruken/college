package org.ruken.college.jpa.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reserved_classes database table.
 * 
 */
@Entity
@Table(name="reserved_classes")
@NamedQuery(name="ReservedClass.findAll", query="SELECT r FROM ReservedClass r")
public class ReservedClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="registration_id")
	private int registrationId;

	@Column(name="class_id")
	private String classId;

	@Column(name="student_id")
	private String studentId;

	public ReservedClass() {
	}

	public int getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
