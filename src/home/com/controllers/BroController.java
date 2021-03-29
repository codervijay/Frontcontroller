package home.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bro")
public class BroController {

	@RequestMapping("/bat")
	public String getBall() {
		return "MRFBat";
	}
}
