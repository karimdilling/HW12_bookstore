package de.uni.koeln.se.bookstore.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String author;
	private Integer year;
	private Double price;
	
	public Book() {}
	
	public Book(String name, String author, Integer year, Double price) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getYear() {
		return year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getId() {
		return id;
	}

	public Double getPrice() {
		return price;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
