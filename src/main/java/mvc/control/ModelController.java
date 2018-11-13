package mvc.control;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
	
	@ModelAttribute("fruit")
	List<String> fruit(){
		//메소드 이름은 중요하지 않다!
		return Arrays.asList("사과,배,메론,수박".split(","));
	}
	
	@RequestMapping("model/detail")
	String detail(Model model) {
	
		model.addAttribute("dd", "detail");
		return "model/view";
	}
	
	@RequestMapping("model/list")
	String list(Model model) {
	
		model.addAttribute("dd", "list");
	
		return "model/view";
	}
	
	@RequestMapping("model/insert")
	String insert(Model model) {
	
		model.addAttribute("dd", "insert");
	
		return "model/view";
	}
	
}
