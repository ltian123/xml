                                           package parse;

import java.io.IOException;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.xmlrules.DigesterLoader;
import org.xml.sax.SAXException;


public class DigesterParse {

	public static void main(String[] args) {
		//加载配置文件(rule.xml),并获取解析器
		Digester digester = DigesterLoader.createDigester(DigesterParse.class.getClassLoader().getResource("parse/rule.xml"));
		
		//准备一个空的根元素对象
		ClassBean classBean = new ClassBean();
		
		digester.push(classBean);
		
		try {
			//解析
			digester.parse(DigesterParse.class.getClassLoader().getResourceAsStream("student.xml"));
			System.out.println(classBean);
			
			System.out.println(classBean.findById(1));
			System.out.println(classBean.findById(1).getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
}
