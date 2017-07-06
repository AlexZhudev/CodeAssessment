package com.alexdev.codeassign.metaEntity;

/**
 * Metadata of file:fileid, filename,filesize, and fileupdatetime
 *
 * 
 * 
 * 
 * 
 * 
 * */

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="filemetadata")
public class FileMetaData {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FILEID")
	private String fileId;

	@Column(name = "FILENAME", nullable = false)
	private String fileName;

	@Column(name = "FILESIZE", nullable = false)
	private Long fileSize;

	@Column(name="UPLOADTIME",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date uploadTime;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date date) {
		this.uploadTime = date;
	}

	@Override
	public String toString() {
		return "FileMetaData ： fileId is " + fileId + ", fileName is " + fileName + ", fileSize is " + fileSize + ", uploadTime is "
				+ uploadTime + ". ";
	}
		
}
