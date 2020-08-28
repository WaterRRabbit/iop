package com.pandora.iop.bean;

/**
 * @author YHG
 * @date 2020/8/19 15:28
 */
public class XmlBean {

    private XmlDependBean xmlDependBean;

    public void setXmlDependBean(XmlDependBean xmlDependBean) {
        this.xmlDependBean = xmlDependBean;
    }

    public String who() {
        return "xmlBean";
    }

    public String depend() {
        return xmlDependBean.who();
    }

}
