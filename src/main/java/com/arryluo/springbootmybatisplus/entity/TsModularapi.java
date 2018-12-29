package com.arryluo.springbootmybatisplus.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author arryluo
 * @since 2018-12-27
 */
public class TsModularapi implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * api名称
     */
    private String apiname;

    private String createTime;

    /**
     * 是否删除
     */
    private Integer isdel;

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    @Override
    public String toString() {
        return "TsModularapi{" +
        "apiname=" + apiname +
        ", createTime=" + createTime +
        ", isdel=" + isdel +
        "}";
    }
}
