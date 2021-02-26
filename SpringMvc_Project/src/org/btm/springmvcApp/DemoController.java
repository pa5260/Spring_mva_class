package org.btm.springmvcApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DemoController 
{
	public DemoController()
	{
		System.out.println("DemoController Object Created");
	}
	@RequestMapping(value="/btm",method=RequestMethod.POST)
	public ModelAndView display(@ModelAttribute Demo dm)
	{
		System.out.println("Inside display()");
		String msg="Message is "+dm.getNm();
		return new ModelAndView("Success","key",msg);
		
	}
	@RequestMapping(value="/btm1",method=RequestMethod.POST)
	public String display1(@ModelAttribute Demo dm,ModelMap map)
	{
		System.out.println("Inside display()");
		String msg="Message is "+dm.getNm();
		map.addAttribute("key", msg);
		return "Success";
	}
	
}
