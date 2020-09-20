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


    @RequestMapping(value = "/selectById")
    public Conferenceroom selectConferenceroomByName(String roomname){
        Conferenceroom conferenceroom=conferenceroomService.selectConferenceroomByName("李娜");
        return conferenceroom;
    }
    
    @RequestMapping(value="/conferenceroom",method=RequestMethod.GET)
    public String getAllConferencerooms(){
        return JSON.toJSONString(conferenceroomService.getAllConferencerooms());

    }

  @RequestMapping(value = "/meetingroom_add",method = RequestMethod.POST)
    public int insertConferenceroom(@RequestBody Conferenceroom conferenceroom){
        return  conferenceroomService.insertConferenceroom(conferenceroom);
    }



    @RequestMapping(value="/meetingroom_update",method = RequestMethod.GET)
    public  String updateConferenceroom(@RequestBody Conferenceroom conferenceroom){
        int con=conferenceroomService.updateConferenceroom(conferenceroom);
        return JSON.toJSONString(Result.success(con));
    }



    @RequestMapping(value="deleteConferenceroom",method = RequestMethod.DELETE)
    public String deleteConferenceroom(String id ){
        int num = conferenceroomService.deleteConferenceroom(id);
        return JSON.toJSONString(Result.success(num));
    }
}
