package com.upday.editor.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Article Pojo class
 * @author Shubham Dhingra
 *
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	
	private String articleUUID;
	private String header;
	private String description;
	private String text;
	private String keywords;
	private String author;
	private Date publishDate;
	private int eTag;

}
