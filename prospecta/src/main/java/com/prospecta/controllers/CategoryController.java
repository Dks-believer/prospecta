package com.prospecta.controllers;

public class CategoryController {

	
	@RestController
	@RequestMapping("/cat")
	public class CategoryController {
		
		@Autowired
		private CategoryService catService;

		@PostMapping("/{id}")
		public  ResponseEntity<Category> addcat(@RequestBody Category cat,@PathVariable("id") String uniqueId) throws CategoryAlredayAdded, UserNotLogedinException {
			Category cat = CategoryService.addcat(uniqueId);
			return new ResponseEntity<>(Category,HttpStatus.ACCEPTED);
		}
		@GetMapping("/{id}")
		public  ResponseEntity<BankAccount> viewAllCategoryDetails(@PathVariable("id") String uniqueId) throws  UserNotLogedinException{
			Category catDetails =CategoryService.viewAllcat(uniqueId);
			return new ResponseEntity<Category>(catDetails,HttpStatus.ACCEPTED);
		}
}
