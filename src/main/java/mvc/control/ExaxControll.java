package mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.model.Exam;

@Controller
public class ExaxControll {
	
	@RequestMapping("mvc/frist")
	public String frist(Model model) {
		
		System.out.println("첫번째실행");
		
		model.addAttribute("st",new Exam("원빈", 88,87,86));
		
		return "mvc/frist";
	}
	
	@RequestMapping("mvc/sec")
	public ModelAndView sec() {
		
		ModelAndView res = new ModelAndView("mvc/sec");
		res.addObject("st", new Exam("투빈",98,77,85));
	
		return res; 
		
	}
	
	@RequestMapping("mvc/thrid")
	public String thrid(Exam exam) {
		exam.setName("쓰리빈");
		exam.setJum(new int[] {71,65,66});
		
		System.out.println(exam.getName());
		return "mvc/thrid";
	}
	
	@RequestMapping("mvc/thrid2")
	public String thrid_2(Exam st) {
		st.setName("쓰리빈");
		st.setJum(new int[] {71,65,66});
		
		System.out.println(st.getName());
		return "mvc/thrid";
	}
	
	@RequestMapping("mvc/four")
	public String four(@ModelAttribute("st") Exam st) {
		
				
		return "mvc/four";
		
	}
	@RequestMapping(value="mvc/five", method=RequestMethod.GET)
	public String five() {
		
		return "mvc/five";
	}
	
	@RequestMapping(value="mvc/five", method=RequestMethod.POST)
	public String fiveReg2(Exam exam) {
		
		return "mvc/fiveReg";
	}
	
//	@RequestMapping("mvc/fiveReg")
//	public String fiveReg(Exam exam) {
//		
//		return "mvc/fiveReg";
//	}
	
	
}
