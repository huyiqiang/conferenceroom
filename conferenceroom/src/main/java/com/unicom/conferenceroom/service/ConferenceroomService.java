package com.unicom.conferenceroom.service;

import com.unicom.conferenceroom.entity.Conferenceroom.Conferenceroom;

import java.util.List;

/**
 * Create By lina on 2020/9/18
 **/
public interface ConferenceroomService {

   //数据库的查找
    List<Conferenceroom> getAllConferencerooms();

    Conferenceroom selectConferenceroomById(int id);

    //数据库的插入
    int insertConferenceroom(Conferenceroom conferenceroom);


    //数据库的更新
    int updateConferenceroom(Conferenceroom conferenceroom);

    //数据库的删除
    int deleteConferenceroom(int  id);
}
