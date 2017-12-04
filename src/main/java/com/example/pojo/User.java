package com.example.pojo;

public class User {
    /**
     * 用户的身份证编号
     */
    private String userid;
    /**
     * 用户的姓名
     */
    private String username;
    /**
     * 用户的性别
     */
    private String sex;
    /**
     * 用户的年纪
     */
    private int age;
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
