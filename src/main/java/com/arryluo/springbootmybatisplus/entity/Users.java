package com.arryluo.springbootmybatisplus.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author arryluo
 * @since 2018-12-26
 */
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String pwd;

    private String img;

    private String type;

    private LocalDateTime createtime;

    private String nickname;

    private String roleid;

    /**
     * 索引
     */
    private String figindex;

    /**
     * 手机号码
     */
    private String userphton;

    /**
     * 邮箱
     */
    private String useremal;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    private String jianjie;

    /**
     * 0,标识正常，1标识被禁用
     */
    private Integer isdel;

    /**
     * 关联账户uid
     */
    private String formuid;

    /**
     * 0不是管理员,1是管理员
     */
    private Integer isadmin;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
    public String getFigindex() {
        return figindex;
    }

    public void setFigindex(String figindex) {
        this.figindex = figindex;
    }
    public String getUserphton() {
        return userphton;
    }

    public void setUserphton(String userphton) {
        this.userphton = userphton;
    }
    public String getUseremal() {
        return useremal;
    }

    public void setUseremal(String useremal) {
        this.useremal = useremal;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }
    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
    public String getFormuid() {
        return formuid;
    }

    public void setFormuid(String formuid) {
        this.formuid = formuid;
    }
    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public String toString() {
        return "Users{" +
        "username=" + username +
        ", pwd=" + pwd +
        ", img=" + img +
        ", type=" + type +
        ", createtime=" + createtime +
        ", nickname=" + nickname +
        ", roleid=" + roleid +
        ", figindex=" + figindex +
        ", userphton=" + userphton +
        ", useremal=" + useremal +
        ", sex=" + sex +
        ", age=" + age +
        ", jianjie=" + jianjie +
        ", isdel=" + isdel +
        ", formuid=" + formuid +
        ", isadmin=" + isadmin +
        "}";
    }
}
