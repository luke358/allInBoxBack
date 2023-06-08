package com.luke.allinboxback.service.impl;

import com.luke.allinboxback.entity.App;
import com.luke.allinboxback.mapper.AppMapper;
import com.luke.allinboxback.service.AppService;
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
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements AppService {

}
