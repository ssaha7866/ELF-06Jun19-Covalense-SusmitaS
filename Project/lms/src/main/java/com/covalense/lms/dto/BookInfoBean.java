package com.covalense.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "book_info")
public class BookInfoBean implements Serializable{

	@Id
	@JsonProperty(value = "book_id")
	@Column(name="book_id")
	private int bookId;
	
	@JsonProperty(value = "book_name")
	@Column(name="book_name")
	private int bookName;
	
	@JsonProperty(value = "catagory")
	@Column(name="catagory")
	private int catagory;
	
	@JsonProperty(value = "author")
	@Column(name="author")
	private int author;
	
	@JsonProperty(value = "publisher")
	@Column(name="publisher")
	private int publisher;
	
	@JsonProperty(value = "price")
	@Column(name="price")
	private int price;
	
	@JsonProperty(value = "edition")
	@Column(name="edition")
	private int edition;
	
	@JsonProperty(value = "rating")
	@Column(name="rating")
	private int rating;
	
	@JsonProperty(value = "language")
	@Column(name="language")
	private int language;
	
	@JsonProperty(value = "no_of_copies")
	@Column(name="no_of_copies")
	private int noc;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookName() {
		return bookName;
	}

	public void setBookName(int bookName) {
		this.bookName = bookName;
	}

	public int getCatagory() {
		return catagory;
	}

	public void setCatagory(int catagory) {
		this.catagory = catagory;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}

	public int getNoc() {
		return noc;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}
	
	
	
}
