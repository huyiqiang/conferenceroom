package com.unicom.conferenceroom.controller.Conferenceroom;
import com.alibaba.fastjson.JSON;
import com.unicom.conferenceroom.entity.Conferenceroom.Conferenceroom;
import com.unicom.conferenceroom.service.ConferenceroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create By lina on 2020/9/17
 **/

@CrossOrigin
@RestController
public class ConferenceroomController {

    @Autowired
    private ConferenceroomService conferenceroomService;


    @RequestMapping(value = "/conferenceroom/{id}",method=RequestMethod.GET)
    public String selectConferenceroomByid(@PathVariable("id") int id){
        Conferenceroom conferenceroom=conferenceroomService.selectConferenceroomByid(id);
        return JSON.toJSONString(conferenceroom);
    }
    @RequestMapping(value="/conferenceroom",method=RequestMethod.GET)
    public String getAllConferencerooms(){
        return JSON.toJSONString(conferenceroomService.getAllConferencerooms());

    }



    @RequestMapping(value = "/meetingroom_add",method = RequestMethod.POST)
    public int insertConferenceroom(@RequestBody Conferenceroom conferenceroom){
        return  conferenceroomService.insertConferenceroom(conferenceroom);
    }



    @RequestMapping(value="/meetingroom_update",method = RequestMethod.POST)
    public  int updateConferenceroom(@RequestBody Conferenceroom conferenceroom){
        return conferenceroomService.updateConferenceroom(conferenceroom);
    }



    @RequestMapping(value="deleteConferenceroom",method = RequestMethod.DELETE)
    public void deleteConferenceroom(@RequestBody Conferenceroom conferenceroom ){

    }
}
