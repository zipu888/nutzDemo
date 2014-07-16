package com.xiaohao.interceptor;

import org.nutz.aop.InterceptorChain;
import org.nutz.aop.MethodInterceptor;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by xiaohao on 2014/7/11
 * 定义自己的aop切面
 * 必须要让框架管理这个类 @iocBean
 * 实现MethodInterceptor接口
 */
@IocBean
public class LogInterceptor implements MethodInterceptor {

    @Override
    public void filter(InterceptorChain interceptorChain) throws Throwable {
        //方法执行前
        System.out.println("before");
        //可以取得这些多
        String methodName =interceptorChain.getCallingMethod().getName();
        interceptorChain.getArgs();
        interceptorChain.getCallingObj();
        interceptorChain.getMethodInterceptors();
        interceptorChain.getReturn();
        interceptorChain.doChain();
        //方法执行后
        System.out.println("after"+"  "+methodName);
    }
}
