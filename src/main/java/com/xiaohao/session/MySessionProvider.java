package com.xiaohao.session;


import org.nutz.mvc.impl.session.AbstractSessionProvider;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * Created by xiaohao on 2014/7/11.
 * 提供session 分离的支持
 */
public class MySessionProvider extends AbstractSessionProvider {

    @Override
    public HttpSession createSession(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, ServletContext servletContext) {
        HttpSession session =httpServletRequest.getSession(true);
        return session;
    }
}
