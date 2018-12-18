package com.upday.editor.constants;
/**
 * Constants file containing API messages
 * @author Shubham Dhingra
 *
 */
public class MessageConstants {
	
	public static final String HEADER_CONSTRAINT_MESSAGE = "Article header field cannot be longer than 200 characters";
	
	public static final String DESCRIPTION_CONSTRAINT_MESSAGE = "Article description field cannot be longer than 200 characters";
	
	public static final String HEADER_EMPTY_MESSAGE = "Header cannot be empty";
	
	public static final String ARTICLE_UUID_CONSTRAINT = "Article UUID should not be null / empty.";
	
	public static final String DUPLICATE_ENTRY = "Article you are trying to add already exists.";
	
	public static final String ALREADY_MODIFIED = "Article you are trying to modify had already been modified before."
			+ "Please re-fetch the article and re-try";
	
	public static final String ARTICLE_NOT_FOUND = "Article you specified does not exists.";
	
	public static final String INVALID_PAYLOAD = "Invalid Payload";
	
	public static final String UNABLE_TO_FETCH_ARTICLES = "Unable to find articles with provided specification";
	 
	 

}
