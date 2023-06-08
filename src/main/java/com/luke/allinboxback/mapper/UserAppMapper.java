package com.luke.allinboxback.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.luke.allinboxback.entity.App;
import com.luke.allinboxback.entity.UserApp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luke.allinboxback.vo.UserAppVo;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
@Mapper
public interface UserAppMapper extends BaseMapper<UserApp> {


    @Select("select * from user_app as ua left join app a on ua.app_id = a.id where ${ew.sqlSegment}")
    List<UserAppVo> getListByUser(@Param("ew") QueryWrapper wrapper);

}
