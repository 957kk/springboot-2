package com.zxk.springboot2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-2
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-22 10:08
 **/
@RestController
public class app {

    @RequestMapping("h")
    public String hello() {
        return "hello";
    }
}
