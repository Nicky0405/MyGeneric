package com.example.tryGeneric.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student implements Serializable, GenericEntity<Student> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

   
	public Student(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	@Override
    public Long getId(){
        return this.id;
    }
//
//    @Override
//    public void update(Student source) {
//        this.name = source.getName();
//        this.email =source.getEmail();
//       
//    }
//
//    @Override
//    public Student createNewInstance() {
//        Student newInstance = new Student();
//        newInstance.update(this);
//
//        return newInstance;
//    }
}
