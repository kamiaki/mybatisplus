package com.aki.mybatisplus.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Aki
 * @since 2019-07-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("userName")
    private String userName;

    @TableField("userAge")
    private Integer userAge;

    private LocalDate birthday;

    @TableField("phoneNum")
    private Integer phoneNum;

    private String address;

    private String remark;


}
