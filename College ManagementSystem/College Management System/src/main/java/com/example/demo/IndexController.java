package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@Autowired
       CollegeDAO collegeDAO;
	
     @RequestMapping("view")   
	public ModelAndView index(@RequestParam("number")Integer it) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("usernumber",it);
		mv.setViewName("describe.jsp");
		System.out.println("***" + it + "***");
     	return mv;	
     }
     @RequestMapping("addDept")
 	public ModelAndView adddept(College college) {
 		System.out.println(college.getDeptNo());
 		System.out.println(college.getDeptName());
         ModelAndView mv = new ModelAndView();
         mv.addObject("collegeDetails",college);
         mv.setViewName("added.jsp");
         collegeDAO.save(college);
         return mv;
 	}
     
 	@RequestMapping("viewDept")
 	public ModelAndView display(College college) {
 	Optional<College> op = collegeDAO.findById(college.getDeptNo());
 	 College college1  = op.get();
 	 ModelAndView mv=new ModelAndView();
 	 mv.addObject("collegeDetails",college1);
      mv.setViewName("display.jsp");
     
      return mv;
      
  	 
 	}
 	@RequestMapping("deleteDept")
 	public ModelAndView deletedept(College college) {
 		ModelAndView mv=new ModelAndView();
 		collegeDAO.deleteById(college.getDeptLabCount());
 	 mv.addObject("collegeDetails",college);
      mv.setViewName("deleted.jsp");
  	
     return mv;
 	 
 	}
 	@RequestMapping("updateDept")
	 public ModelAndView updateuser(College college) {
	ModelAndView mv = new ModelAndView();
	collegeDAO.findById(college.getDeptNo());
	collegeDAO.deleteById(college.getDeptLabCount());
	mv.addObject("collegeDetails",college);
		mv.setViewName("updated.jsp");
		
		return mv;
 	}	
}		
		
		

	
 
