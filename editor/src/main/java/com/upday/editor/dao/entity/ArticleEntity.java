package com.upday.editor.dao.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Article entry which gets persisted in the DB
 * @author Shubham Dhingra
 *
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Article", uniqueConstraints = {@UniqueConstraint(columnNames = {"HEADER", "AUTHOR"})})
public class ArticleEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="articleUUID")
	private String articleUUID;
	
	@Column(name="HEADER")
	private String header;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="TEXT", columnDefinition = "TEXT")
	private String text;
	
	@Column(name="KEYWORDS")
	private String keywords;
	
	@Column(name = "PUBLISH_DATE")
	private Date publishDate;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Version
	@Column(name = "Etag")
	private int eTag;
	

}
