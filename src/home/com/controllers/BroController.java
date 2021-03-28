package home.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bro")
public class BroController {

	@ResponseBody
	@RequestMapping("/ball")
	public String getBall() {
		return " Give the ball bro ";
	}
}
