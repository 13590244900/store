package com.kehua.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangb
 * @time 20200508
 */
//@Controller和@ResponseBody（加在方法/类上面）一起使用，和@RestController的作用相同。
@RestController
public class IndexController {
    @RequestMapping("/hello")
    public String index(){
        return "hello 墨叔！";
    }

}