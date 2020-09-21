package com.unicom.conferenceroom.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.unicom.conferenceroom.dao.approve.ApproveDao;
import com.unicom.conferenceroom.entity.ResultInfo;
import com.unicom.conferenceroom.entity.approve.Approve;
import com.unicom.conferenceroom.service.ApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author DangShuang
 * @Date 2020/9/18 11:48
 * @Version 1.0
 */
@Service
public class ApproveServiceImpl implements ApproveService {
    @Autowired
    ApproveDao approveDao;

    /**
     * 查询预约会议
     * @param jsonStr
     * @return
     */
    @Override
    public ResultInfo selectConferenceOrder(String jsonStr) {
        ResultInfo resultInfo = new ResultInfo();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Approve approve = jsonObject.toJavaObject(Approve.class);

        Approve conferenceList = approveDao.selectConferenceOrder(approve);
        Map map = new HashMap();
        map.put("conferenceOrder", conferenceList);

        if (null == conferenceList) {
            resultInfo.setCode(-1);
            resultInfo.setResultInfo("会议信息查询失败！");
        } else {
            resultInfo.setCode(200);
            resultInfo.setResultInfo("会议信息查询成功！");
            resultInfo.setRetObj(map);
        }
        return resultInfo;
    }

    /**
     * 查询会议详情
     * @param jsonStr
     * @return
     */
    @Override
    public ResultInfo selectConferenceInfo(String jsonStr) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Approve approve = jsonObject.toJavaObject(Approve.class);
        Approve conferenceList = approveDao.selectConferenceById(approve.getConferenceId());

        if (conferenceList.getAppStatus()==null ) {
            Approve conferenceInfo = approveDao.selectConferenceInfo(approve);
            Map map = new HashMap();
            map.put("conferenceInfo", conferenceInfo);
            if (conferenceInfo==null) {
                resultInfo.setCode(-1);
                resultInfo.setResultInfo("会议详情查询失败！");
            } else {
                resultInfo.setCode(200);
                resultInfo.setResultInfo("会议详情查询成功！");
                resultInfo.setRetObj(map);
            }
        }else {
        resultInfo.setCode(200);
        resultInfo.setResultInfo("会议详情查询成功！");
        }
        return resultInfo;
    }

    /**
     * 审批会议
     * @param jsonStr
     * @return
     * @throws Exception
     */
    @Override
    public ResultInfo approveConference(String jsonStr) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Approve approve = jsonObject.toJavaObject(Approve.class);

        Approve conferenceList = approveDao.selectConferenceById(approve.getConferenceId());

        if (conferenceList.getAppStatus()=="已审批" ) {
            resultInfo.setCode(0);
            resultInfo.setResultInfo("已审批！");
        }
        if (approveDao.approveConference(approve) < 1){
            resultInfo.setCode(-1);
            resultInfo.setResultInfo("审批未通过！");
        }
        resultInfo.setCode(200);
        resultInfo.setResultInfo("审批通过！");
        return resultInfo;
    }

    @Override
    public void insertConferenceId(int id) {
        approveDao.insertConferenceId(id);
    }

}
