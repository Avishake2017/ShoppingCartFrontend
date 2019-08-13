package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import daos.CategoryDao;
import model.Category;


@Controller
public class CatagoryController {
	
	@Autowired
	CategoryDao categorydao;
	
	@RequestMapping(value ="/", method=RequestMethod.GET)
	public String welcome() {
		return "HomePage";
		
	}
	@RequestMapping(value ="getCategoryForm", method=RequestMethod.GET)
	public String fetchCategoryForm(ModelMap map) {
		System.out.println("dsf");
		Category category = new Category();
		map.addAttribute("categoryObj",category);
		return "CategoryForm";
	}
	@RequestMapping(value = "addCategory",method = RequestMethod.POST)
	public String addCategory(@ModelAttribute Category categoryObj,ModelMap map) {
		map.addAttribute("categoryObj",categoryObj);
		categorydao.addCategory(categoryObj);
		return "viewCategory";
	}
	
}
