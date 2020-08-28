package com.pandora.iop.configuration;

import com.pandora.iop.bean.ActorBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author YHG
 * @date 2020/8/20 10:23
 */
@Configuration
public class ActorBeanConfiguration {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ActorBean actorBean() {
        return new ActorBean();
    }

}
