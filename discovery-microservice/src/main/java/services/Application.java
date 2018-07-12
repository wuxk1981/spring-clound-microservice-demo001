package services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Description: [功能描述]</p>
 * Created on 2018/7/12 18:15
 *
 * @author <a href="mailto: wuxinkuan@camelotchina.com">吴心宽</a>
 * @version 1.0
 * Copyright (c) 2018 北京柯莱特科技有限公司
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
