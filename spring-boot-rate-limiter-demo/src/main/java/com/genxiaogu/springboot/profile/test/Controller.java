package com.genxiaogu.springboot.profile.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by genxiaogu on 2017/5/17.
 */
@RestController("/")
public class Controller {

    @Autowired
    DataPermissionTest dataPermissionTest ;

    @RequestMapping("/test")
    public String check(){
        return dataPermissionTest.test() ;
    }

    @RequestMapping("/test2")
    public String check2(){
        return dataPermissionTest.test2() ;
    }
}
