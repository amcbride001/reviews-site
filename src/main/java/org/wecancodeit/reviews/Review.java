package org.wecancodeit.reviews;

public class Review {

	private long id;
	private String location;
	private String imageUrl;
	private String content;
	private String name;
	
public Review(long id, String location, String name) {
	this.id = id;
	this.location = location;
	this.imageUrl = imageUrl;
	this.name = name;
	
	
}

public Long getId() {
	
	return id;
}

public Object getDate() {

	return null;
}
public String getContent() {
	return content;
}
public String getName() {
	return name;
}
public String getLocation() {
	return location;
}
}
