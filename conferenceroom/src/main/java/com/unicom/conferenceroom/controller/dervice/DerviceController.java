package com.unicom.conferenceroom.controller.dervice;

import com.unicom.conferenceroom.entity.dervice.ResultInfo;
import com.unicom.conferenceroom.service.DerviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin // 跨域请求问题
@RestController
public class DerviceController {
    @Autowired
    private DerviceService derviceService;

    /**
     * 创建设备
     */
    @RequestMapping(value = "/createDervice")
    @ResponseBody
    public ResultInfo createDervice(@RequestBody String jsonStr)throws Exception{

        return derviceService.createDervice(jsonStr);

    }

    /**
     * 删除设备
     */
    @RequestMapping(value = "/deleteDervice",method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
    public ResultInfo deleteDervice(@RequestBody String jsonStr) throws Exception {

        return derviceService.deleteDervice(jsonStr);
    }

    /**
     * 查询设备
     */
    @RequestMapping(value = "/queryDervice",method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
    public ResultInfo queryDervice(@RequestBody String jsonStr) throws Exception {

        return derviceService.queryDervice(jsonStr);
    }

    /**
     * 修改设备
     */
    @RequestMapping(value = "/updateDervice",method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
    public ResultInfo updateDervice(@RequestBody String jsonStr) throws Exception {

        return derviceService.updateDervice(jsonStr);
    }
}
