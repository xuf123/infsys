package com.hw.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by pandehua on 2017/6/27.
 */
@ApiModel
public class UserInfo {
    @JsonProperty("username")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @JsonProperty("password")
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
