package com.prospecta.service;

import com.prospecta.model.Category;

public interface CategoryService {

	
	public Category addcat(Category cat, String UniqueID) throws userNotLoggedinException,CategoryAlreadyExists;

	public Category viewAllAcat(String uniqueId) throws UserNotLogedinException;
	

	

}
