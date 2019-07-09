package com.aki.mybatisplus.service;

import com.aki.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Aki
 * @since 2019-07-09
 */
public interface IUserService extends IService<User> {
    User selectOneUser(Integer id);

    IPage<User> selectPageVo(Page page, Integer userAge);
}
