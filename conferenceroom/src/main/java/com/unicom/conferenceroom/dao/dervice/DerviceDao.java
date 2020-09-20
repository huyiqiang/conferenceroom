package com.unicom.conferenceroom.dao.dervice;

import com.alibaba.fastjson.JSONObject;
import com.unicom.conferenceroom.entity.dervice.Dervice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DerviceDao {

    int deleteByPrimaryKey(Integer derviceId);

    int insert(Dervice record);

    int insertSelective(Dervice record);

    List<JSONObject> queryDervice(JSONObject jsonObject);


    Dervice selectByPrimaryKey(Integer derviceId);

    int updateByPrimaryKeySelective(Dervice record);

    int updateByPrimaryKey(Dervice record);

}
