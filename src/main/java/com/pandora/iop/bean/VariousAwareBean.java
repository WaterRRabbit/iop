package com.pandora.iop.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author YHG
 * @date 2020/8/20 9:23
 */
@Component
public class VariousAwareBean implements BeanNameAware {

    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public String who() {
        return beanName;
    }
}
