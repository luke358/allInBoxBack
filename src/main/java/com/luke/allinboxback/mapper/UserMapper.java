package com.luke.allinboxback.mapper;

import com.luke.allinboxback.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
