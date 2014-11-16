package com.github.e4.ps.common.entity;

import java.util.Date;

/**
 * 服务实体类的基类
 *
 * Created by hubin0011@gmail.com on 2014/11/16.
 */
public class BaseServiceEntity {

    /** ID **/
    private String id;

    /** 编号 **/
    private String code;

    /** 创建时间 **/
    private Date createTime;

    /** 修改时间 **/
    private Date updateTime;

    /**
     * 取得ID
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 取得编号
     * @return 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编号
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 取得创建时间
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 取得更新时间
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
     * 设置更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseServiceEntity that = (BaseServiceEntity) o;

        if (!code.equals(that.code)) return false;
        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + code.hashCode();
        return result;
    }
}
