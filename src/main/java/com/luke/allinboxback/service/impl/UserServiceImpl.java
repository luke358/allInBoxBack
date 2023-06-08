package com.luke.allinboxback.service.impl;

import com.luke.allinboxback.entity.User;
import com.luke.allinboxback.mapper.UserMapper;
import com.luke.allinboxback.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
