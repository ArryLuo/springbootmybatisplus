package com.arryluo.springbootmybatisplus.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author arryluo
 * @since 2018-12-26
 */
public class Newtab implements Serializable {

    private static final long serialVersionUID = 1L;

    private String figindex;

    private String title;

    /**
     * 自适应属性
     */
    private String attributes;

    /**
     * 作者
     */
    private String authers;

    private String createtime;

    /**
     * 是否开放
     */
    private String isopen;

    private String listcontent;

    /**
     * 浏览
     */
    private String browse;

    /**
     * 博文封面
     */
    private String logo;

    /**
     * 是否删除
     */
    private Integer isdel;

    /**
     * 置顶,抽取数据时，按照修改时间以及置顶来抽取置顶数据
     */
    private Integer zd;

    /**
     * 热度,也就是浏览次数
     */
    private Integer redu;

    /**
     * 修改时间
     */
    private String updtime;

    /**
     * 分类id
     */
    private String typeid;

    /**
     * 审核:0,代表审核拒绝，1代表审核中，2代表审核通过,3代表重新申请
     */
    private Integer isshenhe;

    /**
     * 关键字
     */
    private String contents;

    public String getFigindex() {
        return figindex;
    }

    public void setFigindex(String figindex) {
        this.figindex = figindex;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
    public String getAuthers() {
        return authers;
    }

    public void setAuthers(String authers) {
        this.authers = authers;
    }
    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen;
    }
    public String getListcontent() {
        return listcontent;
    }

    public void setListcontent(String listcontent) {
        this.listcontent = listcontent;
    }
    public String getBrowse() {
        return browse;
    }

    public void setBrowse(String browse) {
        this.browse = browse;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
    public Integer getZd() {
        return zd;
    }

    public void setZd(Integer zd) {
        this.zd = zd;
    }
    public Integer getRedu() {
        return redu;
    }

    public void setRedu(Integer redu) {
        this.redu = redu;
    }
    public String getUpdtime() {
        return updtime;
    }

    public void setUpdtime(String updtime) {
        this.updtime = updtime;
    }
    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }
    public Integer getIsshenhe() {
        return isshenhe;
    }

    public void setIsshenhe(Integer isshenhe) {
        this.isshenhe = isshenhe;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Newtab{" +
        "figindex=" + figindex +
        ", title=" + title +
        ", attributes=" + attributes +
        ", authers=" + authers +
        ", createtime=" + createtime +
        ", isopen=" + isopen +
        ", listcontent=" + listcontent +
        ", browse=" + browse +
        ", logo=" + logo +
        ", isdel=" + isdel +
        ", zd=" + zd +
        ", redu=" + redu +
        ", updtime=" + updtime +
        ", typeid=" + typeid +
        ", isshenhe=" + isshenhe +
        ", contents=" + contents +
        "}";
    }
}
