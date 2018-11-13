package mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.ByOrder;
import mvc.model.Product;

@Controller
@RequestMapping("mvc/byOrder")
public class ByOrderController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String get() {
		System.out.println("byOrderForm");
		return "mvc/byOrderForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String post(ByOrder byOrder) {
		
		byOrder.execute();
		
		return "mvc/byOrderPost";
	}
}
