package com.arryluo.springbootmybatisplus.service.impl;

import com.arryluo.springbootmybatisplus.entity.Users;
import com.arryluo.springbootmybatisplus.mapper.UsersMapper;
import com.arryluo.springbootmybatisplus.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author arryluo
 * @since 2018-12-26
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
