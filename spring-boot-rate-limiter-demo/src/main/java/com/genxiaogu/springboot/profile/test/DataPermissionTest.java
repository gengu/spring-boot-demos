package com.genxiaogu.springboot.profile.test;
import com.genxiaogu.ratelimiter.annotation.Limiter;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author genxiaogu
 */
@Component
public class DataPermissionTest {

    @Limiter(route = "test", limit = 1)
    public String test(){
        return "test" ;
    }

    @Limiter(route = "test2", limit = 10)
    public String test2(){
        return "test" ;
    }
}

