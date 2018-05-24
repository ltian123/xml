package parse;

import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class JDomParse {

	public static void main(String[] args) {
		//获取解析器
		SAXBuilder build = new SAXBuilder();
		
		try {
			//解析文件,这是jdom提供的树,不是之前jdk提供的
			Document document = build.build(JDomParse
									 .class
									 .getClassLoader()
									 .getResourceAsStream("student.xml"));
			
			//获取根元素
			Element root = document.getRootElement();
			System.out.println("root:"+root.getName());
			
			//获取根元素的属性值
			String no = root.getAttributeValue("no");
			System.out.println("no="+no);
//			List attributes = root.getAttributes();
			//获取子元素
			List<Element> elements = root.getChildren();
			
			//遍历子元素
			for (Element element : elements) {
				System.out.println(element.getAttributes());
				
				Element e = element.getChild("name");
				System.out.println(e);
				
				
				//获取当前标签中文本
				System.out.println("文本内容:"+e.getText());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
