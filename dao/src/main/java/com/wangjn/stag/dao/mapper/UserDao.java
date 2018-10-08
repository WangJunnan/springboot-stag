package com.wangjn.stag.dao.mapper;

import com.wangjn.stag.dao.model.UserDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * UserDao
 *
 * @author wangjn
 * @date 2018/9/29
 */
@Mapper
public interface UserDao {

    @Select("SELECT * FROM wx_user WHERE nickname = #{name}")
    List<UserDO> findByName(@Param("name") String name);

    @Select("SELECT * FROM wx_user WHERE id = #{id}")
    UserDO findById(@Param("id") Integer id);
}
