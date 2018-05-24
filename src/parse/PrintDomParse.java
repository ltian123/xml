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
		//����һ��DOM����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			//��ȡ������
			DocumentBuilder build = factory.newDocumentBuilder();
			//��ȡ��Ҫ������xml�ļ�������
			InputStream in = DomParse.class.getClassLoader().getResourceAsStream("student.xml");
			//����,��xml�������,�ļ���ȡ���,���ڴ����Ѿ���һ�����Խṹ
			Document document = build.parse(in);
			
			Element root = document.getDocumentElement();
			
			print(root);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void print(Element root){
		
		//��ӡ��ǩͷ
		System.out.print("<"+root.getTagName()+" ");
		
		NamedNodeMap map = root.getAttributes();
		if(map != null){
			for(int i = 0; i < map.getLength(); i++){
				//ȡ����ǰ������Ԫ��,ǿ��ת��������
				Attr attr = (Attr) map.item(i);//��һ��Node
				System.out.print(attr.getName()+"=\""+attr.getValue()+"\"");
			}
		}
		
		System.out.print(">");
		
		//��ӡ��ǩ��
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
		
		//��ӡ��ǩβ
		System.out.print("</"+root.getTagName()+">");
		
	}
}
