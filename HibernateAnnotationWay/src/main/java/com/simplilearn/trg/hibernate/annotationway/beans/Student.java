package com.simplilearn.trg.hibernate.annotationway.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdata2")
public class Student {
		@Id
		@Column(name="roll_no")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int rollNo;
		
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
		@Column(name="grade")
		private String grade;

		public Student() {
		}

		public Student(String firstName, String lastName, String grade) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.grade = grade;
		}

		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
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
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", grade="
					+ grade + "]";
		}
		
		
}
