package com.example.tryGeneric.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Book implements Serializable, GenericEntity<Book> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

    @Lob
    private String description;

    private Date releaseDate;
    
    
    

    @Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", releaseDate=" + releaseDate + "]";
	}

	public Book(Long id, String title, String author, String description, Date releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.releaseDate = releaseDate;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
//    public void update(Book source) {
//        this.title = source.getTitle();
//        this.author =source.getAuthor();
//        this.description = source.getDescription();
//        this.releaseDate = source.getReleaseDate();
//    }
//
//    @Override
//    public Book createNewInstance() {
//        Book newInstance = new Book();
//        newInstance.update(this);
//
//        return newInstance;
//    }
}
