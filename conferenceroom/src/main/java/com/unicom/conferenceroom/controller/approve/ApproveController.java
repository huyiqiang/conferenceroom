package com.unicom.conferenceroom.controller.approve;

import com.unicom.conferenceroom.entity.ResultInfo;
import com.unicom.conferenceroom.service.ApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DangShuang
 * @Date 2020/9/18 11:49
 * @Version 1.0
 */
@RestController
public class ApproveController {
    @Autowired
    ApproveService approveService;

    /**
     * 查询预约会议
     * @param jsonStr
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/selectConferenceOrder")
    public ResultInfo selectConferenceOrder(@RequestBody String jsonStr) throws Exception {
        //调用service层
        return approveService.selectConferenceOrder(jsonStr);
    }

    /**
     * 查询会议详情
     * @param jsonStr
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/selectConferenceInfo")
    public ResultInfo selectConferenceInfo(@RequestBody String jsonStr) throws Exception {
        //调用service层
        return approveService.selectConferenceInfo(jsonStr);
    }

    /**
     * 审批会议
     * @param jsonStr
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/approveConference")
    public ResultInfo approveConference(@RequestBody String jsonStr) throws Exception {
        //调用service层
        return approveService.approveConference(jsonStr);
    }
}
