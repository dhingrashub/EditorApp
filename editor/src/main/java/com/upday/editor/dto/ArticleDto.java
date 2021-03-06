package com.upday.editor.dto;

import java.sql.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.upday.editor.constants.EditorConstants;
import com.upday.editor.constants.MessageConstants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Pojo for retrieving article details from the client
 * @author Shubham Dhingra
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto   {
	
	@Size(message = MessageConstants.HEADER_CONSTRAINT_MESSAGE, max = EditorConstants.MAX_HEADER_SIZE_ALLOWED)
	@NotEmpty(message = MessageConstants.HEADER_EMPTY_MESSAGE)
	private String header;
	@Size(message = MessageConstants.DESCRIPTION_CONSTRAINT_MESSAGE,max = EditorConstants.MAX_DESCRIPTION_SIZE_ALLOWED)
	private String description;
	private String text;
	private String keywords;
	private String author;
	private Date publishDate;
	
	
	public interface CreateArticle{
		
	}

}
