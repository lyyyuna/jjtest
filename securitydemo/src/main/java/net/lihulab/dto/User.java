package net.lihulab.dto;

import org.hibernate.validator.constraints.NotBlank;

public class User {
    private String username;

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

    @NotBlank(message = "密码不能为空")
    private String password;


}
