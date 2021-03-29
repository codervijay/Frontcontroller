package home.com.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		model.addAttribute("myWebTitle", "Mom'sCafe");
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		String orderName=request.getParameter("foodType");
		model.addAttribute("orderName", orderName);
		return "process-order";
	}
}
