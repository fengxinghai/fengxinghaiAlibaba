package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * nacos配置中心
 * @Author Guo Huaijian
 * @Date 2020/3/16 15:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosMyTestConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosMyTestConfigApplication.class, args);

        while (true){
            String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
            String username = applicationContext.getEnvironment().getProperty("username");
            System.out.println("currentEnv:"+currentEnv+",username:"+username);
        }



    }

}
