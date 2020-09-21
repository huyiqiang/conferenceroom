package com.unicom.conferenceroom.service.serviceImpl;

import com.unicom.conferenceroom.controller.conference.ConferenceController;
import com.unicom.conferenceroom.dao.conference.ConferenceDao;
import com.unicom.conferenceroom.entity.conference.Conference;
import com.unicom.conferenceroom.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Service
public class ConferenceServiceImpl implements ConferenceService {
@Autowired
private ConferenceDao conferenceDao;

    @Override
    public ArrayList<ConferenceController> findConferenceAll() {
        return conferenceDao.findConferenceAll();
    }

    @Override
    public int deleteConference(String id) {
        return conferenceDao.deleteConference(id);
    }

    @Override
    public int insertConference(Conference conference)  {
        int n=conferenceDao.insertConference(conference);
        return n;
    }

    @Override
    public int selectConferenceId(Conference conference) {
        int id=conferenceDao.selectConferenceId(conference);
        return id;
    }
}
