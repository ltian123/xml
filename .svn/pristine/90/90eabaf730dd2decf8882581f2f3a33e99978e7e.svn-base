package parse;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PrintDomParse {

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
			
			Element root = document.getDocumentElement();
			
			print(root);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void print(Element root){
		
		//打印标签头
		System.out.print("<"+root.getTagName()+" ");
		
		NamedNodeMap map = root.getAttributes();
		if(map != null){
			for(int i = 0; i < map.getLength(); i++){
				//取出当前遍历的元素,强制转换成属性
				Attr attr = (Attr) map.item(i);//是一个Node
				System.out.print(attr.getName()+"=\""+attr.getValue()+"\"");
			}
		}
		
		System.out.print(">");
		
		//打印标签体
		NodeList nodeList = root.getChildNodes();
		for(int i = 0; i < nodeList.getLength(); i++){
			Node node = nodeList.item(i);
			short nodeType = node.getNodeType();
			if(nodeType == Node.TEXT_NODE){
				System.out.print(node.getNodeValue());
			}
			if(nodeType == Node.ELEMENT_NODE){
				Element element = (Element) node;
				print(element);
			}
		}
		
		//打印标签尾
		System.out.print("</"+root.getTagName()+">");
		
	}
}
