package com.pandora.iop;

import com.pandora.iop.bean.XmlBean;
import com.pandora.iop.bean.XmlDependBean;
import org.junit.Test;

/**
 * @author YHG
 * @date 2020/8/20 11:16
 */
public class SimpleTest {

    @Test
    public void oldWorld() {
        XmlDependBean xmlDependBean = new XmlDependBean();
        XmlBean xmlBean = new XmlBean();
        xmlBean.setXmlDependBean(xmlDependBean);
        System.out.println(xmlBean.who());
        System.out.println(xmlBean.depend());
    }

}
