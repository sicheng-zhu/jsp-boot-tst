package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// Controller class
// In the basic map /index is assigned. The project works on 'localhost:8080/index'. 
@Controller
@RequestMapping("/index")
public class IndexController {
	private UserServiceInterface userService;
	
	// Spring Setter Injection
	@Autowired
	public void setUserService(UserServiceInterface userService) {
		this.userService = userService;
	}
	
	// @ModelAttribute annotation brings the user information from the View layer to the class type.
	// @RequestParam returns a desired value from the view layer in the annotation. @ModelAttribute is more useful.
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("user")User user) {
    	ModelAndView model = new ModelAndView("index");
    	
    	if (user != null) {
    		userService.saveUser(user);
    		model.addObject("warning", "User Registration Success");
    	} else {
    		model.addObject("danger","Something Going Wrong" );    		
    	}
    	
    	return new ModelAndView("redirect:/index");
    }
	
	// The blank value indicates that it will use base mapping, i.e. /index.
	@RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("list", userService.getAllUsers());
        return model;
    }
		     
    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") long id) {
    	ModelAndView model = new ModelAndView("edit");
    	User user = userService.getUserById(id);
    	model.addObject("user", user);
    	return model;
    }
    
    // This method shows the use of @RequestParam. Data were taken individually.
    // Instead of using @ModelAttribute, "id" information can be retrieved with the get method of "user" type object.
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("id") long id, @RequestParam("firstname") String firstname,
    		                   @RequestParam("lastname") String lastname, @RequestParam("address") String address) {
    	User user = userService.getUserById(id);
    	user.setFirstname(firstname);
    	user.setLastname(lastname);
    	user.setAddress(address);
    	userService.saveUser(user);

    	return new ModelAndView("redirect:/index");
    }
    
	// The value of "id" from the View layer is taken with the @PathVariable anotation.
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable long id) {
		userService.deleteUser(id);
		return new ModelAndView("redirect:/index");
	}	   
}