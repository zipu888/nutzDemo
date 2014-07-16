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
    public View make(Ioc ioc, String type, String value) {
       //这里如果我们直接返回pdfview对象 那么多有的都会走这个对象
        //return new PdfView();
        if("pdf".equals(type)){
            return new PdfView();
        }
        return null;
        //函数 make 如果返回 null，则表示你的这个视图工厂不知道如何构建这种视图。
        // Nutz.Mvc 会看看其他的工厂 能不能创建这个视图。
        // 如果所有的工厂都不能创建这个视图，则会导致异常。

    }
}
