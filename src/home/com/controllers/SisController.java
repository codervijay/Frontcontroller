package home.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit() {
		return "Here is your makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBook() {
		return "Here is your book";
	}
	
}
