package com.unicom.conferenceroom.controller.conference;

import com.alibaba.fastjson.JSON;
import com.unicom.conferenceroom.entity.conference.Conference;
import com.unicom.conferenceroom.entity.conference.FileVO;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.ApproveService;
import com.unicom.conferenceroom.service.ConferenceService;
import com.unicom.conferenceroom.service.DerviceService;
import com.unicom.conferenceroom.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@CrossOrigin
@Scope("prototype")
@RestController
public class ConferenceController {
    @Autowired
    ConferenceService conferenceService;
    @Autowired
    ApproveService approveService;
    //    查询所有会议
    @RequestMapping(value = "findConferenceAll")
    public String findConferenceAll() {
        ArrayList<ConferenceController> list = conferenceService.findConferenceAll();
        return JSON.toJSONString(list);//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
    //  删除会议
    @RequestMapping(value = "deleteConference")
    public String deleteUser(String id) {
        int num = conferenceService.deleteConference(id);
        return JSON.toJSONString(Result.success(num));//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
    //  添加会议
    @RequestMapping(value = "insertConference",method = RequestMethod.POST)
    public String insertConference(Conference conference, HttpServletRequest request){

        System.out.println(conference);
        String fileName = conference.getFile().getOriginalFilename();
        System.out.println(fileName);
        System.out.println(conference.getFile().getSize());

        System.out.println(conference.getTopic());

        // 保存文件
        // 获取或指定文件保存路径
//        String path = request.getServletContext().getRealPath("upload");
        String path = "D:\\upload";
        System.out.println(path);
        File filePath = new File(path);
        System.out.println(filePath.exists());

        if(!filePath.exists()){
            filePath.mkdirs();
        }

        try {
            conference.getFile().transferTo(new File(filePath, fileName));
            System.out.println("111");
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(path+fileName);
        conference.setFilepath(path+fileName);
        //添加会议表
        int num=conferenceService.insertConference(conference);

        //查询新添加的会议id
        int id = conferenceService.selectConferenceId(conference);
        System.out.println(id);
        approveService.insertConferenceId(id);


        return JSON.toJSONString(Result.success(num));//返回的是Json数据，因为RestController注解中有@ResponseBody的作用

    }



}
