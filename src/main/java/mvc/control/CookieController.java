package mvc.control;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	@RequestMapping("cookie/make")
	public String make(Model model, HttpServletResponse response ) {
		
		response.addCookie(new Cookie("pid","aaa"));
		model.addAttribute("title", "쿠키생성");
		
		return "cookie/make";
	}
	
	@RequestMapping("cookie/view")
	public String view(Model model, @CookieValue(value="pid", defaultValue="ccc")String pid) {
		
		model.addAttribute("title", "쿠키보기");
		model.addAttribute("pid", pid);
		return "cookie/view";
				
	}
	
	@RequestMapping("cookie/modify")
	public String modify(Model model, HttpServletResponse response ) {
		
		response.addCookie(new Cookie("pid","bbbb"));
		model.addAttribute("title", "쿠키수정");
		
		return "cookie/view";
	}
	
	@RequestMapping("cookie/delete")
	public String delete(Model model, HttpServletResponse response ) {
		
		Cookie coo = new Cookie("pid", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		model.addAttribute("title", "쿠키삭제");
		
		return "cookie/view";
	}
}
