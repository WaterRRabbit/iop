package com.pandora.iop.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author YHG
 * @date 2020/8/20 9:45
 */
@Component
public class PostProcessorBean implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("actorBean".equals(beanName)) {
            System.out.println("before:" + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("actorBean".equals(beanName)) {
            System.out.println("after:" + beanName);
        }
        return bean;
    }
}
