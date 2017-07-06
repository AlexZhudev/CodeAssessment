package com.alexdev.codeassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.alexdev.codeassign.metaEntity.FileMetaData;

@RepositoryRestResource
public interface MetaRepository extends JpaRepository<FileMetaData, String> {

}
