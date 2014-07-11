/**
 * Created by xiaohao on 2014/7/9.
 */
var ioc={
    dataSource : {
        type : "com.alibaba.druid.pool.DruidDataSource",
        events : {
            depose : 'close'
        },
        fields : {
            url : "jdbc:mysql://127.0.0.1:3306/platform?useUnicode=true&characterEncoding=utf-8",
            username : "root",
            password : "xiaohao"
        }
    },
    dao : {
        type : 'org.nutz.dao.impl.NutDao',
        args : [ {
            refer : 'dataSource'
        } ]
    }
}
