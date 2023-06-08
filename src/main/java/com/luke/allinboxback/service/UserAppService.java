package com.luke.allinboxback.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.luke.allinboxback.entity.UserApp;
import com.baomidou.mybatisplus.extension.service.IService;
import com.luke.allinboxback.vo.UserAppVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
public interface UserAppService extends IService<UserApp> {

    List<UserAppVo> getList(@Param("ew") QueryWrapper wrapper);

}
