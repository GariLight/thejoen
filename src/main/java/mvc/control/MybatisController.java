package mvc.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.BoardDTO;
import mvc.model.ListDTO;
import mvc.model.PageStatus;
import mvc.service.BoardDAO;
import mvc.service.FileService;

@Controller
@RequestMapping("mybatis/{service}")
public class MybatisController {
	
	@Autowired
	BoardDAO dao;
	@Autowired
	FileService fileService;
	
	PageStatus status = new PageStatus();
	
	@ModelAttribute("status")
	public Object statusGo() {
		return status;
	}
	
	
	@ModelAttribute
	public void listGo(@PathVariable("service") String service
			,ListDTO dto) {
		if("insertMultiReg".equals(service)) {
			
			dao.insertList(dto);
		}
		try {
			if("insertErrorReg".equals(service)) {
					dao.insertError(dto);
			}
		}catch(Exception e){
				status.setMsg("id 입력 에러발생!");
				status.setUrl("list");
			}
			
		}

	
	@ModelAttribute("data")
	public Object dataGo(@PathVariable("service") String service
			, BoardDTO dto
			, HttpServletRequest request) {
		
		Object res = null;
		switch(service) {
		case "list" : 
			System.out.println(dto.getCntType());
			res = dao.list(dto);
			break;
	
		case "detail":
			dao.addCount(dto);
			res = dao.selectDetail(dto);
			break;
			
		case "insertReg" :
			if(!dto.getUpfileMM().isEmpty()) {
				dto.setUpfile(fileService.fileUpload(dto.getUpfileMM(), request));
			}
			res = dao.insertOne(dto);
			System.out.println(res+":"+dto);
			
			status.setMsg("입력완료!");
			status.setUrl("detail?id="+dto.getId());
			
			res=dto;
			
			break;
			
		case "insertMultiReg" :
			status.setMsg("연속글쓰기 입력성공");
			status.setUrl("list");
			res = dto;
			break;
			
		case "modifyForm":
			res = dao.selectDetail(dto);
			break;
			
		case "deleteReg" :
			status.setMsg("ID PW 불일치");
			status.setUrl("deleteForm?id="+dto.getId());
			if(dao.delDetail(dto) >= 1) {
				status.setMsg("삭제성공");
				status.setUrl("list");
			}
			res = dto;
			break;
			
		case "modifyReg" :
			status.setMsg("ID PW 불일치");
			status.setUrl("modifyForm?id="+dto.getId());
			if(dao.modifyDetail(dto) >= 1) {
				status.setMsg("암호일치");
				status.setUrl("detail?id="+dto.getId());
			}
			res = dto;
			break;
			
		}
		return res;
	}
	
	@RequestMapping()
	public String view(@PathVariable("service") String service) {
		String res = "mybatis/"+service;
		
	/*	if(service.equals("insertReg"))
			res="redirect:list";*/
		
		if(service.endsWith("Reg"))
			res="mybatis/alert";
		
	/*	if(service.equals("deleteReg") 
				|| service.equals("modifyReg")
				|| service.equals("insertReg")
				|| service.equals("insertMultiReg")
				|| service.equals("insertErrorReg")
			)
			res="mybatis/alert";*/

		
		return res;
	}
}
