package com.novelvista.gtest.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name="publisher")
public class Publisher {
	private String publisherName;
	private String address;
	private String country;
	List<Book> allPublishedBooks;

}
