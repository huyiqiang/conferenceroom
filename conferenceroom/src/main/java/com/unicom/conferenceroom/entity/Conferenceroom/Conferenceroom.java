package com.unicom.conferenceroom.entity.Conferenceroom;


/**
 * Create By lina on 2020/9/17
 **/

public class Conferenceroom {
    private int id;
    private String roomname;
    private String address;
    private String number;
    private String state;
    private String principal;
    private String airconditioning;
    private String projector;
    private String times;


    public int getId() {
        return id;
    }

    public String getRoomname() {
        return roomname;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getAirconditioning() {
        return airconditioning;
    }

    public String getProjector() {
        return projector;
    }

    public String getTimes() {
        return times;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setAirconditioning(String airconditioning) {
        this.airconditioning = airconditioning;
    }

    public void setProjector(String projector) {
        this.projector = projector;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Conferenceroom{" +
                "id=" + id +
                ", roomname='" + roomname + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", state='" + state + '\'' +
                ", principal='" + principal + '\'' +
                ", airconditioning='" + airconditioning + '\'' +
                ", projector='" + projector + '\'' +
                ", times=" + times +
                '}';
    }
}
