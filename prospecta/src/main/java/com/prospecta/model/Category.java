package com.prospecta.model;

public class Category {

	 private String title;
	 private String description;
	 private String auth;
	 private boolean https;
	 private String cors;
	 private String category;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public boolean isHttps() {
		return https;
	}
	public void setHttps(boolean https) {
		this.https = https;
	}
	public String getCors() {
		return cors;
	}
	public void setCors(String cors) {
		this.cors = cors;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Category [title=" + title + ", description=" + description + ", auth=" + auth + ", https=" + https
				+ ", cors=" + cors + ", category=" + category + "]";
	}
	public Category(String title, String description, String auth, boolean https, String cors, String category) {
		super();
		this.title = title;
		this.description = description;
		this.auth = auth;
		this.https = https;
		this.cors = cors;
		this.category = category;
	}
	 
	 
}
