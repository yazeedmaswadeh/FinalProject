package hh.yazeed.application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String studentnumber;
	private String time;

	public Student() {
	}

	public Student(String firstname, String lastname, String email, String studentnumber, String time) {
		super();
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.studentnumber = studentnumber;
		this.time = time;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", studentnumber=" + studentnumber + ", time=" + time + "]";
	}

	
}
