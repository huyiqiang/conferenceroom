package com.unicom.conferenceroom.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.unicom.conferenceroom.dao.dervice.DerviceDao;
import com.unicom.conferenceroom.entity.dervice.Dervice;
import com.unicom.conferenceroom.entity.dervice.ResultInfo;
import com.unicom.conferenceroom.service.DerviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("derviceService")
public class DerviceServiceImpl implements DerviceService {

    @Autowired
    private DerviceDao derviceDao;

    @Override
    public ResultInfo createDervice(String jsonStr) throws Exception {
        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Dervice dervice = jsonObject.toJavaObject(Dervice.class);

        int i=derviceDao.insertSelective(dervice);
        if(i<1){
            resultInfo.setCode(-1);
            resultInfo.setResultInfo("新增设备失败");
            return resultInfo;
        }
        resultInfo.setCode(200);
        resultInfo.setResultInfo("新增设备成功");
        return resultInfo;

    }

    @Override
    public ResultInfo deleteDervice(String jsonStr) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Dervice dervice = jsonObject.toJavaObject(Dervice.class);
        //判断是否传入设备id
        if (StringUtils.isEmpty(dervice.getDerviceId())){
            resultInfo.setResultInfo("请输入要删除的设备ID");
            return resultInfo;
        }

        int i = derviceDao.deleteByPrimaryKey(dervice.getDerviceId());
        if (i < 1) {
            resultInfo.setCode(-1);
            resultInfo.setResultInfo("删除设备失败");
            return resultInfo;
        }

        resultInfo.setCode(200);
        resultInfo.setResultInfo("删除设备成功");
        return resultInfo;
    }

    @Override
    public ResultInfo queryDervice(String jsonStr) throws Exception{
        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
      //  Dervice dervice = jsonObject.toJavaObject(Dervice.class);

        List<JSONObject> derviceList = derviceDao.queryDervice(jsonObject);
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("list", derviceList);
        resultInfo.setCode(200);
        resultInfo.setResultInfo("设备查询成功！");

        resultInfo.setRetObj(jsonObject1);

        return resultInfo;
    }

    @Override
    public ResultInfo updateDervice(String jsonStr) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Dervice dervice = jsonObject.toJavaObject(Dervice.class);
        //判断是否传入设备id
        if (StringUtils.isEmpty(dervice.getDerviceId())){
            resultInfo.setResultInfo("请输入要修改的设备ID");
            return resultInfo;
        }

        System.out.println(dervice.getDerviceId());
        Dervice selectDervice = derviceDao.selectByPrimaryKey(dervice.getDerviceId());


        System.out.println(selectDervice);

        if(selectDervice == null){
            resultInfo.setCode(-1);
            resultInfo.setResultInfo("请先选择需要修改的信息，修改信息不存在");
            return resultInfo;
        }

        if (derviceDao.updateByPrimaryKeySelective(dervice) < 1) {
            resultInfo.setCode(-1);
            resultInfo.setResultInfo("操作设备信息失败");
            return resultInfo;
        }

        resultInfo.setCode(200);
        resultInfo.setResultInfo("修改设备信息成功");
        return resultInfo;
    }

}
