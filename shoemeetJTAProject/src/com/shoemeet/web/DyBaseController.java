package com.shoemeet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shoemeet.service.IBaseService;

@Controller
public class DyBaseController <T> {
	
	@Autowired
	private IBaseService baseService;
	
//	@RequestMapping(value = "/pages/{project}/{module}/{menu}")
//    public ModelAndView pages(@PathVariable String project, @PathVariable String module, @PathVariable String menu) throws Exception {
//		return new ModelAndView(project + "/" + module + "/" + menu);
//    }
	
//	@RequestMapping(value = "/pages/{project}/{module}/{menu}")
//	 public ModelAndView pages(@PathVariable String project, @PathVariable String module, @PathVariable String menu) throws Exception {
//		System.out.println(project + "," + module + "," + menu);
//		return new ModelAndView(project + "/" + module + "/" + menu);
//	 }
	
//	@RequestMapping(value = "/hello")
//	 public ModelAndView pages(@PathVariable String project, @PathVariable String module, @PathVariable String menu) throws Exception {
//		System.out.println(project + "," + module + "," + menu);
//		return new ModelAndView("/pages/hello");
//	 }
	
//	@RequestMapping("/hello.do")
//	 public String hello(@PathVariable String project, @PathVariable String module, @PathVariable String menu, Model model) {
//		 model.addAttribute("name", module);
//		 return "/hello";
//	 }
	
	
	@RequestMapping(value = "/{module}/{menu}")
	public String pages(@PathVariable String module, @PathVariable String menu) throws Exception {
		return module + "/" + menu;
	}

}
