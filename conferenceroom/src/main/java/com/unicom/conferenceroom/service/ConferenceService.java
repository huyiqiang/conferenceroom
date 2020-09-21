package com.unicom.conferenceroom.service;

import com.unicom.conferenceroom.controller.conference.ConferenceController;
import com.unicom.conferenceroom.entity.conference.Conference;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

public interface ConferenceService {

    ArrayList<ConferenceController> findConferenceAll();

    int deleteConference(String id);

    int insertConference(Conference conference);

    int selectConferenceId(Conference conference);
}
