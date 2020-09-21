package com.unicom.conferenceroom.controller.Conferenceroom;
import com.alibaba.fastjson.JSON;
import com.unicom.conferenceroom.entity.Conferenceroom.Conferenceroom;
import com.unicom.conferenceroom.service.ConferenceroomService;
import com.unicom.conferenceroom.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create By lina on 2020/9/17
 **/
//
@CrossOrigin
@RestController
public class ConferenceroomController {

    @Autowired
    private ConferenceroomService conferenceroomService;


    @RequestMapping(value = "/conferenceroom/{id}",method = RequestMethod.GET)
    public String selectConferenceroomById(@PathVariable int  id) {
        Conferenceroom conferenceroom=conferenceroomService.selectConferenceroomById(id);
        return JSON.toJSONString(conferenceroom);
    }

    @RequestMapping(value = "/conferenceroom", method = RequestMethod.GET)
    public String getAllConferencerooms() {
        return JSON.toJSONString(conferenceroomService.getAllConferencerooms());

    }

    @RequestMapping(value = "/meetingroom_add", method = RequestMethod.POST)
    public int insertConferenceroom(@RequestBody Conferenceroom conferenceroom) {
        return conferenceroomService.insertConferenceroom(conferenceroom);
    }


    @RequestMapping(value = "/meetingroom_update/{id}", method = RequestMethod.PUT)
    public String updateConferenceroom(@PathVariable int id, @RequestBody Conferenceroom conferenceroom) {
        conferenceroom.setId(id);
        return JSON.toJSONString(conferenceroomService.updateConferenceroom(conferenceroom));

    }
    @RequestMapping(value="/deleteConferenceroom/{userId}",method = RequestMethod.DELETE)
    public String deleteConferenceroom(@PathVariable int userId ){
        int i = conferenceroomService.deleteConferenceroom(userId);
        //如果成功就返回success
        return JSON.toJSONString(i);
    }
}