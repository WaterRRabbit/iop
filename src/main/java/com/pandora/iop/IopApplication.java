package com.pandora.iop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:config/application-bean.xml")
@SpringBootApplication
@EnableAspectJAutoProxy
public class IopApplication {

    public static void main(String[] args) {
        SpringApplication.run(IopApplication.class, args);
    }

}
