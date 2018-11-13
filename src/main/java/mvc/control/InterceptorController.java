package mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

	@RequestMapping("interceptor/event")
	public String event() {
		System.out.println("event컨트롤러");
		return "interceptor/event";
		
	}
	
	@RequestMapping("interceptor/expire")
	public String expire() {
		System.out.println("expire컨트롤");
		return "interceptor/expire";
		
	}
}
