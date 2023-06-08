package com.luke.allinboxback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.luke.allinboxback.entity.UserApp;
import com.luke.allinboxback.mapper.UserAppMapper;
import com.luke.allinboxback.service.UserAppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luke.allinboxback.vo.UserAppVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
@Service
public class UserAppServiceImpl extends ServiceImpl<UserAppMapper, UserApp> implements UserAppService {

    @Autowired
    private UserAppMapper userAppMapper;
    @Override
    public List<UserAppVo> getList(QueryWrapper wrapper) {
        return userAppMapper.getListByUser(wrapper);
    }
}
