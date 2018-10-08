package com.wangjn.stag.biz.impl;

import com.wangjn.stag.biz.UserBizService;
import com.wangjn.stag.dao.mapper.UserDao;
import com.wangjn.stag.dao.model.UserDO;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * UserBizServiceImpl
 *
 * @author wangjn
 * @date 2018/9/29
 */
@Service("userBizService")
public class UserBizServiceImpl implements UserBizService {

    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public List<UserDO> findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public UserDO findById(Integer id) {
        return userDao.findById(id);
    }
}
