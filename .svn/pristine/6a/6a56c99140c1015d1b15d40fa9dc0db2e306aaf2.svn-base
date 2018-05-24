package parse;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * 1.创建一个DOM工厂:DocumentBuilderFactory
 * 2.创建DOM构建器:DocumentBuilder
 * 3.获取需要解析的xml文件输入流
 * 4.解析xml文件获取DOM文档:Document
 * 5.按照DOM规范进行操作
 * @author USER02
 *
 */
public class DomParse {

	public static void main(String[] args) {
		//创建一个DOM工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		
		try {
			//获取解析器
			DocumentBuilder build = factory.newDocumentBuilder();
			
			//获取需要解析的xml文件输入流
			InputStream in = DomParse.class.getClassLoader().getResourceAsStream("student.xml");
			
			//解析,将xml解析完成,文件读取完成,在内存中已经有一个属性结构
			Document document = build.parse(in);
			
			
			//获取跟标签class
			Element root = document.getDocumentElement();
			
//			System.out.println("root:"+root);
			//获取class中no属性的值
//			String no = root.getAttribute("no");
//			System.out.println("no:"+no);
//			
//			//获取class标签的名字
//			System.out.println("class标签名:"+root.getTagName());
			
			
			NodeList nodeList = root.getChildNodes();
//			System.out.println(nodeList.getLength());
			
			//节点类型的常量
//			System.out.println("文本节点常量值:"+Node.TEXT_NODE);
//			System.out.println("元素节点常量值:"+Node.ELEMENT_NODE);
			
			
			for(int i = 0; i < nodeList.getLength(); i++){
				Node node = nodeList.item(i);
//				System.out.println("node:"+node);
				short nodeType = node.getNodeType();
//				System.out.println(nodeType);
				
				if(nodeType==Node.TEXT_NODE){
					System.out.println("这是文本节点,值为:"+node.getNodeValue());
				}
				if(nodeType==Node.ELEMENT_NODE){
					System.out.println("这是元素节点,值为:"+node.getNodeValue());
					Element childElement = (Element) node;
					System.out.println("student标签名:"+childElement.getTagName());
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
		
		
		
		
		
		
		
		
	}
	
}
