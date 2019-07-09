package com.aki.mybatisplus.mapper;

import com.aki.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Aki
 * @since 2019-07-09
 */
public interface UserMapper extends BaseMapper<User> {
    User selectOneUser(Integer id);

    IPage<User> selectPageVo(Page page, @Param("userAge") Integer userAge);
}
