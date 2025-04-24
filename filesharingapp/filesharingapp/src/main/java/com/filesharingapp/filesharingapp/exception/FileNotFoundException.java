package com.filesharingapp.filesharingapp.exception;

public class FileNotFoundException extends RuntimeException{
    public FileNotFoundException (String message){
        super(message);
    }
}
