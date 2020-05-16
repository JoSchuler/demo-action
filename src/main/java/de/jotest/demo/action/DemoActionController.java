package de.jotest.demo.action;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoActionController {

	@RequestMapping("/demo-action")
	public String index() {
		return "Greetings from /demo-action endoint!";
	}

}