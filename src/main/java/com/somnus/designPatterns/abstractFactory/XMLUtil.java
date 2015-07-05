package com.somnus.designPatterns.abstractFactory;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/** 
 * @Title: XMLUtil.java 
 * @Package com.somnus.designPatterns.abstractFactory
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:25:47 
 * @version V1.0 
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名  
    public static Object getBean() throws Exception {
        SAXReader reader = new SAXReader();
        String path = XMLUtil.class.getClassLoader().
                getResource("com/somnus/designPatterns/abstractFactory/config.xml").getPath();
        Document document = reader.read(new File(path));
        String cName = document.selectSingleNode("/config/className").getText();
        //通过类名生成实例对象并将其返回  
        Class<?> c = Class.forName(cName);  
        Object obj = c.newInstance();  
        return obj;  
    }  
}
