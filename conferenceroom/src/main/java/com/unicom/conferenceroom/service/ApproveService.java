package com.unicom.conferenceroom.service;


import com.unicom.conferenceroom.entity.ResultInfo;

/**
 * @Author DangShuang
 * @Date 2020/9/18 11:47
 * @Version 1.0
 */
public interface ApproveService {

     ResultInfo selectConferenceOrder(String jsonStr)throws Exception;

     ResultInfo selectConferenceInfo(String jsonStr) throws Exception;

     ResultInfo approveConference(String jsonStr) throws Exception;
}
