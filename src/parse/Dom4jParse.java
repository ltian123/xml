package parse;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jParse {

	public static void main(String[] args) {
		//获取解析器
		SAXReader reader = new SAXReader();
		try {
			//解析文件
			Document document = reader.read(Dom4jParse.class.getClassLoader().getResourceAsStream("student.xml"));
			
			//获取根元素
			Element root = document.getRootElement();
			System.out.println(root.getName());
			
			String no = root.attributeValue("no");
			System.out.println("no:"+no);
			
			Iterator<Element> it = root.elementIterator();
			while(it.hasNext()){
				Element element = it.next();
				
				List<Attribute> list = element.attributes();
				System.out.println(list);
				for (Attribute attribute : list) {
					System.out.println(attribute.getName());
					System.out.println(attribute.getText());
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
