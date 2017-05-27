package com.acedata.boots.domain.pojo;

import java.util.Date;


public class Task {

    private String id;
    private String content;
    private Integer userId;
    private String flag;
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", flag='" + flag + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
