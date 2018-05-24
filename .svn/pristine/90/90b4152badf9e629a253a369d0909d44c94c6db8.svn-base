package parse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class TestSaxParse {

	public static void main(String[] args) {
		//SAX解析器
		try {
			XMLReader parse = XMLReaderFactory.createXMLReader();
			
			//注册事件
//			parse.setContentHandler(new XMLContentHandler());
			parse.setContentHandler(new PrintContentHandler());
			
			//找到需要解析的xml文件
			//获取xml文件的输入流
			InputStream in = TestSaxParse.class.getClassLoader().getResourceAsStream("student.xml");
			
			parse.parse(new InputSource(in));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		File file = new File("WebRoot/WEB-INF/classes/student.xml");
//		System.out.println(file.exists());
//		try {
////			System.out.println(file.getCanonicalPath());
//			System.out.println(file.getAbsolutePath());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
}
