package com.xiaohao.entity;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * Created by xiaohao on 2014/7/10.
 */
@Table("t_u_r_ref")
public class UserRoleRef {
    @Column
    private int uid;
    @Column
    private int rid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
