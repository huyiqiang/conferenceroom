package com.unicom.conferenceroom.dao.approve;

import com.unicom.conferenceroom.entity.approve.Approve;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author DangShuang
 * @Date 2020/9/18 11:50
 * @Version 1.0
 */
@Mapper
public interface ApproveDao {
    Approve  selectConferenceOrder(Approve approve);
    Approve selectConferenceById(int id);

    Approve selectConferenceInfo(Approve approve);

    int approveConference(Approve approve);
}
