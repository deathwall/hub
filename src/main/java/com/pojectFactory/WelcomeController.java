package com.pojectFactory;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.title:test}")
	private String title = "unknow";
	
	@Value("${welcome.label.date:test}")
	private String dateLabel = "unknow";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("title", title);
		model.put("lastUpdateTime", dateLabel + new Date());
		return "welcome";
	}

}