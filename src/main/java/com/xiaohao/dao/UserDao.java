package com.xiaohao.dao;

import com.xiaohao.entity.User;
import org.nutz.dao.Chain;
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
    public void insertUser(User user){
        dao.insert(user);
        //取得主见
        user.getId();

        //删除 user表
        dao.drop(User.class);


        //用逐渐获取
        User user2 =dao.fetch(User.class,2);
        user2.setName("haoPangZi");
        //更新
        dao.update(user2);

        // 更新表
        dao.update(User.class, Chain.make("name", "testtest"), Cnd.where("age",">",150));


        dao.updateIgnoreNull(user2);


        //按条件清除
        dao.clear(User.class,Cnd.where("id", ">", 35));


    }
}
