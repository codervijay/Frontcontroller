package home.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class MomController {
	
	@RequestMapping("/sugar")
	public String getSugar(Model model) {
		return "Here is your sugar";
	}

}
