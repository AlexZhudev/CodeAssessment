package com.alexdev.codeassign.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alexdev.codeassign.exception.FileException;
import com.alexdev.codeassign.metaEntity.FileMetaData;
import com.alexdev.codeassign.repository.MetaRepository;



@Service
public class FileServiceImpl implements FileService {
	
	private final Path rootLocation;
	
	@Autowired
	private MetaRepository metaRepository;
	
    @Autowired
    public FileServiceImpl(FileProperties properties) {
        this.rootLocation = Paths.get(properties.getLocation());
    }

	@Override
	public void store(MultipartFile file, FileMetaData fileMetaData) {
        try {
            if (file.isEmpty()) {
                throw new FileException("Failed to upload File: No file selected" + file.getOriginalFilename());
            }
            Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
            metaRepository.save(fileMetaData);
        } catch (IOException e) {
            throw new FileException("Failed to store file " + file.getOriginalFilename(), e);
        }

	}
	

}
