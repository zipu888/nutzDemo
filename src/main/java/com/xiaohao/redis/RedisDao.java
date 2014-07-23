package com.xiaohao.redis;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import redis.clients.jedis.Jedis;

/**
 * Created by xiaohao on 2014/7/21.
 *
 */
@IocBean
public class RedisDao {
    @Inject("jedis")
    protected Jedis jedis;

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}
