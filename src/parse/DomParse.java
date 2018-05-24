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
 * 1.����һ��DOM����:DocumentBuilderFactory
 * 2.����DOM������:DocumentBuilder
 * 3.��ȡ��Ҫ������xml�ļ�������
 * 4.����xml�ļ���ȡDOM�ĵ�:Document
 * 5.����DOM�淶���в���
 * @author USER02
 *
 */
public class DomParse {

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
			
			
			//��ȡ����ǩclass
			Element root = document.getDocumentElement();
			
//			System.out.println("root:"+root);
			//��ȡclass��no���Ե�ֵ
//			String no = root.getAttribute("no");
//			System.out.println("no:"+no);
//			
//			//��ȡclass��ǩ������
//			System.out.println("class��ǩ��:"+root.getTagName());
			
			
			NodeList nodeList = root.getChildNodes();
//			System.out.println(nodeList.getLength());
			
			//�ڵ����͵ĳ���
//			System.out.println("�ı��ڵ㳣��ֵ:"+Node.TEXT_NODE);
//			System.out.println("Ԫ�ؽڵ㳣��ֵ:"+Node.ELEMENT_NODE);
			
			
			for(int i = 0; i < nodeList.getLength(); i++){
				Node node = nodeList.item(i);
//				System.out.println("node:"+node);
				short nodeType = node.getNodeType();
//				System.out.println(nodeType);
				
				if(nodeType==Node.TEXT_NODE){
					System.out.println("�����ı��ڵ�,ֵΪ:"+node.getNodeValue());
				}
				if(nodeType==Node.ELEMENT_NODE){
					System.out.println("����Ԫ�ؽڵ�,ֵΪ:"+node.getNodeValue());
					Element childElement = (Element) node;
					System.out.println("student��ǩ��:"+childElement.getTagName());
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
		
		
		
		
		
		
		
		
	}
	
}
