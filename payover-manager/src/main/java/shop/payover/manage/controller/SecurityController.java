package shop.payover.manage.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
	

    @RequestMapping(value ="/login", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
    		@RequestParam(value = "logout", required = false) String logout) {
    	ModelAndView modelAndView = new ModelAndView();
    	System.out.println("----------------login-----------------");
    	System.out.println(1);
    	if (error != null) {
    		modelAndView.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			modelAndView.addObject("msg", "You've been logged out successfully.");
		}
		modelAndView.setViewName("login");
    	
        return modelAndView;
    }
    
    @RequestMapping(value = {"/", "/index.html"}, method = RequestMethod.GET)
    public String index() {
    	System.out.println("----------------index-----------------");
        return "index";
    }

    @RequestMapping(value = "/dashboard.html", method = RequestMethod.GET)
    public String dashboard(ModelMap model) {
        Object userDetails = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute(userDetails);
        return "dashboard";
    }

    @RequestMapping(value = "/main.html", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
