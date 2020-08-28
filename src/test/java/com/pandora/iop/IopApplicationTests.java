package com.pandora.iop;

import com.pandora.iop.bean.VariousAwareBean;
import com.pandora.iop.bean.XmlBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IopApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        XmlBean xmlBean = applicationContext.getBean("xmlBean", XmlBean.class);
        System.out.println(xmlBean.who());
        System.out.println(xmlBean.depend());
    }

    @Autowired
    private VariousAwareBean variousAwareBean;

    @Test
    public void beanNameAware() {
        System.out.println(variousAwareBean.who());
    }

}
