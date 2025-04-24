package com.filesharingapp.filesharingapp.service;

import com.filesharingapp.filesharingapp.model.FileModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    public List<FileModel> getAll();
    public ResponseEntity<?> uploadFile(MultipartFile file,String uploadedBy)throws IOException;
    public ResponseEntity<?> shareFile(int id);
    public ResponseEntity<?> deleteFile(int id);
    public ResponseEntity<?> getFile(int id);
    public void deleteExpiredFiles();
}
