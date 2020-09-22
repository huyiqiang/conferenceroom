package com.unicom.conferenceroom.entity.conference;

import org.springframework.web.multipart.MultipartFile;

public class FileVO {

    String userName;
    MultipartFile file;
    MultipartFile[] fileList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }


    public MultipartFile[] getFileList() {
        return fileList;
    }

    public void setFileList(MultipartFile[] fileList) {
        this.fileList = fileList;
    }
}
