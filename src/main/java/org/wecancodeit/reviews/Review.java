package org.wecancodeit.reviews;

public class Review {

	private long id;
	private String title;
	private String imageUrl;
	private String category;
	private String location;
	private String content;
	private String name;
	
public Review(long id, String location, String name) {
	this.id = id;
	this.title = title;
	this.imageUrl = imageUrl;
	this.category = category;
	this.location = location;
	this.content = content;
	this.name = name;
	
	
}

public Long getId() {
	
	return id;
}

public String getTitle() {
	return title;
}
public String getImage() {
	return imageUrl;
}

public String getCategory() {
	return category;
}

public String getLocation() {
	return location;
}
public String getContent() {
	return content;
}
public String getName() {
	return name;
}
public String getDate() {

	return null;
}

}

