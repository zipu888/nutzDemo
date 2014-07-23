package com.xiaohao.service;

import com.xiaohao.dao.BaseDao;
import com.xiaohao.dao.UserDao;
import com.xiaohao.entity.User;
import com.xiaohao.redis.RedisDao;
import org.nutz.ioc.aop.Aop;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by xiaohao on 2014/7/9.
 * UserService  注入userDao
 */
@IocBean
public class UserService {

    @Inject
    UserDao userDao;
    @Inject
    RedisDao redisDao;

    //定义api切面 切面类 需要写名字 类型首字母要小写
    // 切面可以接收一个可变的字符串 这样就定义了两个切面
    //下面就是控制台的输出
    // before
    // before
    //2014-07-11 11:22:52 DEBUG [http-9999-1] SELECT * FROM t_user  WHERE id=?
    //        | 1 |
    //        |---|
    //        | 1 |
    //For example:> "SELECT * FROM t_user  WHERE id=1"
    //after
    //after
    /**
     *
     * @param id
     * @return
     */
    @Aop({"logInterceptor","logInterceptor"})
    public User findUserById(int id){
        User user= userDao.findUserById(id);
        //加载关联的role  list
        //2014-07-11 12:12:01 DEBUG [http-9999-1] SELECT * FROM t_user  WHERE id=?
        //| 1 |
        //|---|
        //| 1 |
        //        For example:> "SELECT * FROM t_user  WHERE id=1"
        //2014-07-11 12:12:01 DEBUG [http-9999-1] SELECT * FROM t_role  WHERE id IN (SELECT rid FROM t_u_r_ref WHERE uid=1)
        userDao.findLink(user,"role");
        //redisDao.getJedis().set("NNNNNNNNNNNNNNNNNNNN","MMMMMMMMMMMMMMMMMM");
        double a =16/0;
        return user;
    }

    public RedisDao getRedisDao() {
        return redisDao;
    }

    public void setRedisDao(RedisDao redisDao) {
        this.redisDao = redisDao;
    }
}
