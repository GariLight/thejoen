package mvc.control.admin;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("admin/main")
	String main(HttpSession session, HttpServletResponse response) {
		return "admin/main";
	}
}
