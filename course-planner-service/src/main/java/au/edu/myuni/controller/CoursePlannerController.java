package au.edu.myuni.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursePlannerController {

	@RequestMapping("/courses")
	public String getCourses() {
		return "Getting all the courses....";
	}
}
