package com.unicom.conferenceroom.entity.conference;

import org.springframework.web.multipart.MultipartFile;

public class Conference {
    private int id;
    private String topic;
    private int number;
    private String level;
    private String startTime;
    private String endTime;
    private MultipartFile file;
    private String filepath;
    private String conferenceroom;
    private String facility;
    private String attendee;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getConferenceroom() {
        return conferenceroom;
    }

    public void setConferenceroom(String conferenceroom) {
        this.conferenceroom = conferenceroom;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", number=" + number +
                ", level='" + level + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", file=" + file +
                ", filepath='" + filepath + '\'' +
                ", conferenceroom='" + conferenceroom + '\'' +
                ", facility='" + facility + '\'' +
                ", attendee='" + attendee + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
