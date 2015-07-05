package com.somnus.designPatterns.simpleFactory;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/** 
 * @Title: XMLUtil.java 
 * @Package com.somnus.designPatterns.simpleFactory 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:25:47 
 * @version V1.0 
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名  
    public static String getChartType() {
        SAXReader reader = new SAXReader();
        try {
            String path = XMLUtil.class.getClassLoader().
                    getResource("com/somnus/designPatterns/simpleFactory/config.xml").getPath();
            Document document = reader.read(new File(path));
            String chartType = document.selectSingleNode("/config/chartType").getText();
            return chartType;
        } catch (DocumentException e) {
            e.printStackTrace();
            return null;
        }
    }  
}
