package com.xiaohao.view;

import org.nutz.mvc.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiaohao on 2014/7/15.
 * 自定义自己的视图 需要实现view接口 重写render方法
 */
public class PdfView implements View{

    /**
     *编写自己的 render逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o 这个就是mvc请求 返回的值 也就是入口函数返回的值
     * @throws Throwable
     */
    @Override
    public void render(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Throwable {

    }
}
