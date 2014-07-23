package com.xiaohao.entity;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaohao on 2014/7/21.
 *
 */
@Table("t_master")
public class Master implements Serializable {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String skill;

    @Many(target = User.class, field= "masterId")
    private List<User> userList;

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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
