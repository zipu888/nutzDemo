package com.xiaohao.view;

import org.nutz.ioc.Ioc;
import org.nutz.mvc.View;
import org.nutz.mvc.ViewMaker;

/**
 * Created by xiaohao on 2014/7/15.
 * 自定义 视图工厂 需要实现ViewMaker接口 重写make方法
 * 这个
 */
public class PdfViewmaker implements ViewMaker {

    @Override
    public View make(Ioc ioc, String s, String s2) {
        return new PdfView();
    }
}
