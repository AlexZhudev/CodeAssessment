package com.alexdev.codeassign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alexdev.codeassign.metaEntity.FileMetaData;
import com.alexdev.codeassign.service.FileService;

import java.util.Date;
import java.util.UUID;


@Controller
public class UploadController {

	@Autowired
	private FileService fileService;

    @GetMapping("/")
    public String index() {
    	return "upload";
    }

	@PostMapping("/")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
	
		FileMetaData fileMetaData = new FileMetaData();
		fileMetaData.setFileId(UUID.randomUUID().toString());
		fileMetaData.setFileName(file.getOriginalFilename());
		fileMetaData.setFileSize(file.getSize());
		fileMetaData.setUploadTime(new Date());
		fileService.store(file,fileMetaData);
		redirectAttributes.addFlashAttribute("message",
                "File Uploaded " + file.getOriginalFilename() + "!");
		System.out.println(fileMetaData.toString());
		return "redirect:/";
	}
}
