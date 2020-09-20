package com.unicom.conferenceroom.entity.dervice;

import java.util.Date;

public class Dervice {

    private Integer derviceId;

    private String name;

    private String type;

    private Date inputTime;

    private Date scrapTime;

    private String confenerceRoom;

    private String principal;

    private String status;

    public Integer getDerviceId() {
        return derviceId;
    }

    public void setDerviceId(Integer derviceId) {
        this.derviceId = derviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Date getScrapTime() {
        return scrapTime;
    }

    public void setScrapTime(Date scrapTime) {
        this.scrapTime = scrapTime;
    }

    public String getConfenerceRoom() {
        return confenerceRoom;
    }

    public void setConfenerceRoom(String confenerceRoom) {
        this.confenerceRoom = confenerceRoom == null ? null : confenerceRoom.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}