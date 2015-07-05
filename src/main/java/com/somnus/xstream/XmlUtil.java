package com.somnus.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/** 
 * @Title: XmlUtil.java 
 * @Package com.somnus.xstream 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月30日 下午5:59:59 
 * @version V1.0 
 */
public class XmlUtil {
    /**
     * java 转换成xml
     * @Title: toXml 
     * @Description: TODO 
     * @param obj 对象实例
     * @return String xml字符串
     */
    public static String toXml(Object obj){
        XStream xstream=new XStream();
        /*XStream xstream=new XStream(new DomDriver());*/
        /*XStream xstream=new XStream(new DomDriver("utf-8"));*/
         
        /*如果没有这句，xml中的根元素会是<包.类名>；或者说：注解根本就没生效，所以的元素名就是类的属性*/
        xstream.processAnnotations(obj.getClass()); //通过注解方式的，一定要有这句话
        return xstream.toXML(obj);
    }
     
    /**
     *  将传入xml文本转换成Java对象
     * @Title: toBean 
     * @Description: TODO 
     * @param xmlStr
     * @param cls  xml对应的class类
     * @return T   xml对应的class类的实例对象
     * 
     * 调用的方法实例：PersonBean person=XmlUtil.toBean(xmlStr, PersonBean.class);
     */
    @SuppressWarnings("unchecked")
    public static <T> T toBean(String xmlStr,Class<T> cls){
        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(cls);
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;         
    } 
}
