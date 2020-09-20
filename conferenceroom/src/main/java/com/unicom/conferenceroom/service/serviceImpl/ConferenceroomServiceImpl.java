package com.unicom.conferenceroom.service.serviceImpl;

import com.unicom.conferenceroom.dao.Conferenceroom.ConferenceroomDao;
import com.unicom.conferenceroom.entity.Conferenceroom.Conferenceroom;
import com.unicom.conferenceroom.service.ConferenceroomService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By lina on 2020/9/18
 **/
@Service
@Mapper
public class ConferenceroomServiceImpl implements ConferenceroomService {


    @Autowired ConferenceroomDao conferenceroomDao;


    @Override
    public List<Conferenceroom> getAllConferencerooms() {
        return  conferenceroomDao.getAllConferencerooms();
    }


    @Override
    public Conferenceroom selectConferenceroomByName(String roomname) {
        Conferenceroom conferenceroom=conferenceroomDao.selectConferenceroomByName(roomname);
        return conferenceroom;
    }

    @Override
    public  int insertConferenceroom(Conferenceroom conferenceroom) {
        return conferenceroomDao.insertConferenceroom(conferenceroom);
    }


    @Override
    public int updateConferenceroom(Conferenceroom conferenceroom){
        int num=conferenceroomDao.updateConferenceroom(conferenceroom);
        return num;
    }


    @Override
    public int deleteConferenceroom(String id){
        int num=conferenceroomDao.deleteConferenceroom(id);
        return num;
    }

}
