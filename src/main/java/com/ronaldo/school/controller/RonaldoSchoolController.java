package com.ronaldo.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RonaldoSchoolController {

	  @GetMapping(path="/webhook/studentAdded/{name}")
	  public @ResponseBody String studentAdded(@PathVariable String name) {
		  System.out.println("Student name: "+name);
	    return "Webhook Recieved";
	  }
}
