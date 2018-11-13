package mvc.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	String path;
	
	public String fileUpload(MultipartFile mf, HttpServletRequest request) {	
		
		path = request.getRealPath("/resources/up")+"/"; 
		path = "D:\\ybk\\study\\works\\springWork\\mvcProj\\src\\main\\webapp\\resources\\up/";
		
		String res = fileNamePolicy(mf);
		
		try {
			
			FileOutputStream fos = new FileOutputStream(path+res);
			fos.write(mf.getBytes());
			
			fos.close();
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		return res;
	}
	
	public boolean isImgChk(MultipartFile mf) {
		String ext = mf.getOriginalFilename().toLowerCase().substring(
				mf.getOriginalFilename().lastIndexOf(".")+1);
		
//		System.out.println(ext);
		
//		ArrayList<String> extList = new ArrayList<>();
//		for(String string : "jpeg,jpg,bmp,gif,png".split(",")) {
//			extList.add(string);
//		}
		
		return Arrays.asList("jpeg,jpg,bmp,gif,png".split(",")).contains(ext);
	}
	
	String fileNamePolicy(MultipartFile mf) {
		//System.out.println(mf.getOriginalFilename());
		//확장자와 파일명 분리
		int pos = mf.getOriginalFilename().lastIndexOf(".");
		//확장자
		String ext = mf.getOriginalFilename().substring(pos);
		//파일명
		String fileName = mf.getOriginalFilename().substring(0, pos);
		
		
		String res = mf.getOriginalFilename();
		String filePath = path+res;
		
		File file = new File(filePath);
		
		int no = 0;
		//기존파일이 존재하는 지 확인
		while(file.exists()) {
			//파일명 수정
			res = fileName+"_"+no+ext;
			filePath = path+res;
			
			//파일 생성
			file = new File(filePath);
			no++;
		}
		
		return res;
	}
	
	
}
