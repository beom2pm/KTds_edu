package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.UploadDto;

@Controller
public class MainController {

	@RequestMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";  //  /WEB-INF/views/uploadForm.jsp
	}
	
	@RequestMapping("/upload")
	public String upload(UploadDto dto) {
		
		String theText = dto.getTheText();
		MultipartFile theFile = dto.getTheFile();
		
		long size = theFile.getSize();
		String originalFilename = theFile.getOriginalFilename();
		String contentType = theFile.getContentType();
		
		System.out.println(size);
		System.out.println(originalFilename);
		System.out.println(contentType);
		
		//directory 설정
		File f = new File("c://upload", originalFilename);
		
		//실제로 저장
		try {
			theFile.transferTo(f);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "upload";  //  /WEB-INF/views/upload.jsp
	}
	
}
