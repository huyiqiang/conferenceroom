package com.unicom.conferenceroom.entity.approve;

import java.io.Serializable;

/**
 * @Author DangShuang
 * @Date 2020/9/18 11:00
 * @Version 1.0
 */
public class Approve implements Serializable {
    private static final long serialVersionUID = -8137872469826034970L;

    private int approveId;
    private String appResult;
    private String appStatus;
    private String appOpinion;
    private String topic;
    private int number;
    private String level;
    private String startTime;
    private String endTime;
    private String conferenceRoom;
    private String facility;
    private String attendee;
    private String content;
    private String file;
    private int conferenceId;

    public int getApproveId() {
        return approveId;
    }

    public void setApproveId(int approveId) {
        this.approveId = approveId;
    }

    public String getAppResult() {
        return appResult;
    }

    public void setAppResult(String appResult) {
        this.appResult = appResult;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getAppOpinion() {
        return appOpinion;
    }

    public void setAppOpinion(String appOpinion) {
        this.appOpinion = appOpinion;
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

    public String getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(String conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(int conferenceId) {
        this.conferenceId = conferenceId;
    }
}
