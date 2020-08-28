package com.pandora.iop.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author YHG
 * @date 2020/8/20 10:20
 */
public class ActorBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {
    @Autowired
    public void depend() {
        System.out.println("注入依赖");
    }

    public ActorBean() {
        System.out.println("构造方法");
    }

    public void init() {
        System.out.println("init方法");
    }

    @Override
    public void destroy() {
        System.out.println("destory方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("注入BeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("注入BeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("注入ApplicationContext");
    }
}
