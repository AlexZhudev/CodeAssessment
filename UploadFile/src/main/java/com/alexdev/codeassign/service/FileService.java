package com.alexdev.codeassign.service;


import org.springframework.web.multipart.MultipartFile;

import com.alexdev.codeassign.metaEntity.FileMetaData;

public interface FileService {
	void store(MultipartFile file, FileMetaData fileMetaData);
}
