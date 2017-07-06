package com.alexdev.codeassign.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("file")
public class FileProperties {

    private String location = "upload file";
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
