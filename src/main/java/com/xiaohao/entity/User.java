package com.xiaohao.entity;

import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaohao on 2014/7/9.
 */
@Table("t_user")
public class User implements Serializable {

    @Id
    private int id;

    @Column
    private int masterId;

    @One(target = Master.class, field = "masterId")
    private Master master;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 20)
    private String name;

    @Column
    @ColDefine(type = ColType.CHAR, width = 44)
    private String password;

    @ManyMany(target = Role.class, relation = "t_u_r_ref", from = "uid", to = "rid")
    private List<Role> role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public int getMasterId() {
        return masterId;
    }

    public void setMasterId(int masterId) {
        this.masterId = masterId;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }
}
