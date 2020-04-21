package com.java.creational.Builder;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从xml配置文件中提取具体的类名，并返回一个实例
    public static Object getBean(){
//        try {
//            //创建文档对象
//            DocumentBuilderFactory dFactory=DocumentBuilder;
//            DocumentBuilder builder=dFactory.newDocumentBuilder();
//            Document doc;
//            doc=builder.parse(new File("workspace.xml"));
//            //获取包含类名的文本节点
//            NodeList n1=doc.getElementsByTagName("className");
//            Node classNode=n1.item(0).getFirstChild();
//            String cName=classNode.getNodeValue();
//            //通过类名生成实例对象并将其返回
//            Class c=Class.forName(cName);
//            Object obj=c.newInstance();
//            return obj;
//        }catch (Exception e){
            return null;
//        }
    }
}
