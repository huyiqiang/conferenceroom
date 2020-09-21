package com.unicom.conferenceroom.dao.conference;

import com.unicom.conferenceroom.controller.conference.ConferenceController;
import com.unicom.conferenceroom.entity.conference.Conference;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;


@Mapper
public interface ConferenceDao {

    ArrayList<ConferenceController> findConferenceAll();

    int deleteConference(String id);

    int insertConference(Conference conference);

    int selectConferenceId(Conference conference);
}
