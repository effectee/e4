package com.github.e4.msg.domain;

import javax.persistence.Transient;

/**
 * 通知实体类
 *
 * Created by hubin0011@gmail.com on 2014/11/19.
 */
public class Notice {

    private Long id;

    private String content;

    private String url;

    private String status;

    private Long accountId;


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", status='" + status + '\'' +
                ", accountId=" + accountId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notice todo = (Notice) o;

        if (id != null ? !id.equals(todo.id) : todo.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
