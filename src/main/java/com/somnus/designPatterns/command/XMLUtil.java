package com.somnus.designPatterns.command;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/** 
 * @Title: XMLUtil.java 
 * @Package com.somnus.designPatterns.command
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月25日 上午11:25:47 
 * @version V1.0 
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象  
    public static Object getBean(String args) throws Exception {
        SAXReader reader = new SAXReader();
        String path = XMLUtil.class.getClassLoader().
                getResource("com/somnus/designPatterns/command/config.xml").getPath();
        Document document = reader.read(new File(path));
        String cName = null;
        if(args.equals("firstCommand")) {  
            cName = document.selectSingleNode("/config/firstCommand").getText();
              
        }else if(args.equals("secondCommand")) {  
            //获取第二个包含类名的节点，即具体实现类  
            cName = document.selectSingleNode("/config/secondCommand").getText();
        } 
        //通过类名生成实例对象并将其返回  
        Class<?> c = Class.forName(cName);  
        Object obj = c.newInstance();  
        return obj;  
    }  
}
