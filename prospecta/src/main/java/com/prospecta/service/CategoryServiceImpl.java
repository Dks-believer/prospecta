package com.prospecta.service;

import com.prospecta.model.Category;
import com.prospecta.repository.CategoryDao;

public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao catDao;
	
	@Autowired
	private SessionDAO sessionDao;

	@Override
	public Category addcat(Category cat, String UniqueID) throws userNotLoggedinException, CategoryAlreadyExists {
		// TODO Auto-generated method stub
		
Optional<CurrentSessionUser> currentUser =  sessionDao.findByUuid(uniqueId);
		
		if(!currentUser.isPresent()) {
			throw new UserNotLogedinException("Please Login first");
		}
		
		Optional<Customer> customer =  cDao.findById(currentUser.get().getUserId());
		Wallet wallet = customer.get().getWallet();
		
		Optional<Category>  = catDao.findById(Category.getcatDao());
		
	
		return catDao.save(Category);
		
	}

	@Override
	public Category viewAllAcat(String uniqueId) throws UserNotLogedinException {
		// TODO Auto-generated method stub
		return null;
	}
}
