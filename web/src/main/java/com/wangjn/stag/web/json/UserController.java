package com.wangjn.stag.web.json;

import com.wangjn.stag.biz.UserBizService;
import com.wangjn.stag.dao.model.UserDO;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author wangjn
 * @date 2018/9/29
 */
@RestController
public class UserController {

    @Resource(name = "userBizService")
    private UserBizService userBizService;

    @RequestMapping("/getUser")
    public UserDO getUser() {
        return userBizService.findById(230);
    }
}
