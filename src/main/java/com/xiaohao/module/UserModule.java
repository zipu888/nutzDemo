package com.xiaohao.module;

import com.xiaohao.entity.User;
import com.xiaohao.service.UserService;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

/**
 * Created by xiaohao on 2014/7/9.
 *
 * @notice 子模块必须在MainModule类同级目录 或者下级目录 因为扫描类的时候 只扫描这些目录
 *
 */
@IocBean
@At("/xiaopang")
public class UserModule {

    @Inject
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
//jsp:user/test  回访会 user/test.jsp    定义了jsp 默认扩展名就是 jsp
    @At("/test/?")
    @Ok("json")
    public User test( int id){

     User user =userService.findUserById(id);
       return user;
    }

    public static void main(String[] args){
        System.out.println("HHH");
    }
}
