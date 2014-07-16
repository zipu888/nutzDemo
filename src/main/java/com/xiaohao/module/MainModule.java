package com.xiaohao.module;

import com.xiaohao.setup.MyAppSetup;
import com.xiaohao.view.PdfView;
import com.xiaohao.view.PdfViewmaker;
import org.nutz.mvc.annotation.*;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * Created by xiaohao on 2014/7/9
 * 主模块声明.
 * 定义项目加载配置文件路径 和 类的扫描路径
 */
@Fail("json")
@IocBy(type=ComboIocProvider.class,args={
        "*org.nutz.ioc.loader.json.JsonLoader","/conf/MyAppConfig.js",
        "*org.nutz.ioc.loader.annotation.AnnotationIocLoader","com.xiaohao"})
//**声明模块 只扫描主模块下的
// @Modules(value = UserModule.class)
// 声明自己的session provider @SessionBy(NopSessionProvider.class)
@Modules(scanPackage = true)
//自定义视图对象的视图工厂需要 在这里标注
@Views(PdfViewmaker.class)
@Encoding(input="UTF-8",output="UTF-8")
@SetupBy(MyAppSetup.class)
public class MainModule {
}
