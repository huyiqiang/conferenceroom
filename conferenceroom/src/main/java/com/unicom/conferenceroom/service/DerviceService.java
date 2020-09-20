package com.unicom.conferenceroom.service;

import com.unicom.conferenceroom.entity.dervice.ResultInfo;

public interface DerviceService {

    ResultInfo createDervice(String jsonStr) throws Exception;

    ResultInfo deleteDervice(String jsonStr) throws Exception;

    ResultInfo queryDervice(String jsonStr) throws Exception;

    ResultInfo updateDervice(String jsonStr) throws Exception;

}
