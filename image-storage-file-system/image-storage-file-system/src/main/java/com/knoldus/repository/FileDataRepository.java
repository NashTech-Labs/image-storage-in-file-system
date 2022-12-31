package com.knoldus.repository;

import com.knoldus.entity.FileData;
import com.knoldus.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData, Integer> {
    Optional<FileData> findByName(String fileName);
}
