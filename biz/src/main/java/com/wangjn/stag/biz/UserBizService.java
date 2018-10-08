package com.wangjn.stag.biz;

import com.wangjn.stag.dao.model.UserDO;
import java.util.List;

/**
 * UserBizService
 *
 * @author wangjn
 * @date 2018/9/29
 */
public interface UserBizService {

    List<UserDO> findByName(String name);

    UserDO findById(Integer id);
}
