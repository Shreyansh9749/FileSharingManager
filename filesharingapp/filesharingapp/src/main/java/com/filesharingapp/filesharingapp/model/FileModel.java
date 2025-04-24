package com.filesharingapp.filesharingapp.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class FileModel {
    private int id;
    private String fileName;
    private String uploadedBy;
    private LocalDateTime uploadTime;
    private LocalDateTime expiryTime;
    private byte[] fileData;
}
