package com.xiaohao.setup;

import com.xiaohao.entity.Role;
import com.xiaohao.entity.User;
import com.xiaohao.entity.UserRoleRef;
import org.nutz.dao.Dao;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

/**
 * Created by xiaohao on 2014/7/9.
 * 初始化 操作类 需要实现 nutz 框架的 setup 接口
 */
public class MyAppSetup implements Setup {
    @Override
    public void init(NutConfig nutConfig) {
        Ioc ioc =nutConfig.getIoc();
        Dao dao =ioc.get(Dao.class);
        //初始化一些表 插入初始化数据
      //  dao.create(User.class,true);
     //   dao.create(Role.class,true);
     //   dao.create(UserRoleRef.class,true);
    }


    @Override
    public void destroy(NutConfig nutConfig) {

    }
}
