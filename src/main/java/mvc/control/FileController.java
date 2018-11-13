package mvc.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import mvc.model.FileData;
import mvc.service.FileService;

@Controller
@RequestMapping
public class FileController {
	
	@Autowired
	FileService fileService;
	
	@RequestMapping(value="mvc/fileUpload",method=RequestMethod.GET)
	String get() {
		
		return "file/get";
	}
	
	@RequestMapping(value="mvc/fileUpload", method=RequestMethod.POST)
	String post(@RequestParam("id") String id
			, @ModelAttribute("name") String name
			, MultipartFile up1
			, Model model
			) {
		
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("up1.name : "+up1.getName());
		System.out.println("up1.type : "+up1.getContentType());
		System.out.println("up1.Ori : "+up1.getOriginalFilename());
		System.out.println("up1.isEmpty : "+up1.isEmpty());
		
		model.addAttribute("up1", up1.getOriginalFilename());
		
		return "file/post";
	}
	
	@RequestMapping(value="mvc/post2", method=RequestMethod.POST)
	ModelAndView post2(MultipartHttpServletRequest mm) {
		
		ModelAndView res = new ModelAndView();
		
		System.out.println("id : "+mm.getParameter("id"));
		System.out.println("name : "+mm.getParameter("name"));
		
		MultipartFile up1 = mm.getFile("up1");
		System.out.println("up1.name : "+up1.getName());
		System.out.println("up1.type : "+up1.getContentType());
		System.out.println("up1.Ori : "+up1.getOriginalFilename());
		System.out.println("up1.isEmpty : "+up1.isEmpty());
		
		res.addObject("id", mm.getParameter("id") );
		res.addObject("name", mm.getParameter("name"));
		res.addObject("up1", up1.getOriginalFilename() );
		
		res.setViewName("file/post");
		
		return res;
	}
	
	@RequestMapping(value="mvc/post3", method=RequestMethod.POST)
	String post3(FileData data, HttpServletRequest request, Model model){
		
		if(fileService.isImgChk(data.getUp2())) {
		data.setSys1(fileService.fileUpload(data.getUp1(), request));
		data.setSys2(fileService.fileUpload(data.getUp2(), request));
		
		model.addAttribute("id", data.getId());
		model.addAttribute("name", data.getName());
		model.addAttribute("sys1", data.getSys1());
		model.addAttribute("sys2", data.getSys2());
		model.addAttribute("age", 29);
		
		
			return "redirect:fileView";
		}
		
		return "file/error";
	}
	
	@RequestMapping(value="mvc/fileView")
	String fileView(FileData data
			, @RequestParam(value="age")int age
			, @RequestParam(value="grade", required=false, defaultValue="5")Integer grade) {
		
	System.out.println("grade: "+grade);	
	
		return "file/post3";
	}
			
//	void fileUpload2(MultipartFile mf, HttpServletRequest request) {
//		
//		checkImg(mf);
//		
//		String path = request.getRealPath("/resources/up"); 
//		path = "D:\\ybk\\study\\works\\springWork\\mvcProj\\src\\main\\webapp\\resources\\up";
//		String fileName = checkExist(mf, path);
//		
//		try(FileOutputStream fos = new FileOutputStream(path+"/"+fileName)) {
//			
//			System.out.println(path+"/"+fileName);
//			fos.write(mf.getBytes());
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	void checkImg(MultipartFile mf) {
//		int tmp = mf.getOriginalFilename().lastIndexOf(".");
//		
//		String aaa = mf.getOriginalFilename().substring(tmp+1);
//		aaa = aaa.toLowerCase();
//		String[] bbb = {"jpg","jpeg","bmp","gif","png"};
//		
//		int cnt = 0;
//		for(String test : bbb) {
//			if(test.equals(aaa))
//				break;
//			else {
//				cnt++;
//			}
//		}
//		if(cnt == 5) {
//			System.out.println("이미지파일아님");
//		}
//	}
	
//	String checkExist(MultipartFile mf, String path) {
//		File file = new File(path);
//		File[] fileList = file.listFiles();
//		
//		for(File test : fileList) {
//			if(test.getName().toLowerCase().equals(mf.getOriginalFilename().toLowerCase()))
//				return mf.getOriginalFilename().substring(0, mf.getOriginalFilename().lastIndexOf("."))+"(2)";
//		}
//		
//		return mf.getOriginalFilename();
//	}
//	
	
}
