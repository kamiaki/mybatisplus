package com.aki.mybatisplus.mapper;

import com.aki.mybatisplus.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Aki
 * @since 2019-07-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
