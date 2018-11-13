package mvc.control;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {

	@RequestMapping("session/make")
	public String make(HttpSession session ) {
		
		session.setAttribute("pid", "aaa");
		session.setAttribute("title", "세션생성");
		
		return "session/make";
	}
	
	@RequestMapping("session/view")
	public String view(HttpSession session ) {
		
		System.out.println("pid : "+session.getAttribute("pid"));
		session.setAttribute("title", "세션보기");
		
		return "session/view";
	}
	
	@RequestMapping("session/modify")
	public String modify(HttpSession session ) {
		
		session.setAttribute("pid", "bbb");
		session.setAttribute("title", "세션수정");
		
		return "session/view";
	}
	
	@RequestMapping("session/delete")
	public String delete(HttpSession session ) {
		
		session.invalidate();
		
		
		return "session/view";
	}
}
