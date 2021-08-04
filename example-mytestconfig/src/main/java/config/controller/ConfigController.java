package config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Guo Huaijian
 * @Date 2020/3/16 23:54
 */
@RestController
public class ConfigController {


    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${username}")
    private String userName;


    @GetMapping("name")
    public String name(){
        return applicationContext.getEnvironment().getProperty("username");
    }

    @GetMapping("getConfigProperty")
    public String getUserName(){
        return userName;
    }
}
