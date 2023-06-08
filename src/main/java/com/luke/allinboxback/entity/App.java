package com.luke.allinboxback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author luke
 * @since 2023-06-07 06:04:25
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("app")
@ApiModel(value = "App对象", description = "")
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("url")
    private String url;

    @TableField("iconUrl")
    private String iconUrl;

    @TableField("team")
    private String team;


}
