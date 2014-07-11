package com.xiaohao.dao;

import com.xiaohao.entity.User;
import org.nutz.dao.Cnd;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.trans.Atom;
import org.nutz.trans.Trans;

/**
 * Created by xiaohao on 2014/7/9.
 */
@IocBean
public class UserDao extends BaseDao<User> {

    public User findUserById(int id){
        return find(id,User.class);
    }

    public void updateUser(final User user){
        Trans.exec(new Atom() {
            @Override
            public void run() {
                update(user);
            }
        });
    }
}
