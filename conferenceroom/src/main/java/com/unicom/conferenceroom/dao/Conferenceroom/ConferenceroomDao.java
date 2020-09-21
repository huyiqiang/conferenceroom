package com.unicom.conferenceroom.dao.Conferenceroom;

import com.unicom.conferenceroom.entity.Conferenceroom.Conferenceroom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Create By lina on 2020/9/17
 **/

@Mapper
public interface ConferenceroomDao {

   /**
     * 查询所有会议室信息
     */
//    @Select("select * from conferenceroom")
    List<Conferenceroom> getAllConferencerooms();

    /**
     * 按会议室名字查询会议室信息
     */
    Conferenceroom selectConferenceroomById(int id);

    /**
     * 新增会议室信息
     * @return
     */
    int  insertConferenceroom(Conferenceroom conferenceroom);

    /**
     * 更新会议室信息
     */
    int updateConferenceroom(Conferenceroom conferenceroom);

    /**
     * 删除会议室信息
     */
    int deleteConferenceroom(int id);

}
