package parse;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class XMLContentHandler implements ContentHandler{

	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		
	}

	public void startDocument() throws SAXException {
		System.out.println("***************xml文档解析的开始***************");
	}

	public void endDocument() throws SAXException {
		System.out.println("***************xml文档解析结束***************");
	}

	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		System.out.println("-------------------------");
		System.out.println("uri:"+uri);
		System.out.println("localName:"+localName);
		System.out.println("qName:"+qName);
		System.out.println("atts:"+atts);
		System.out.println("no:"+atts.getValue("no"));
		System.out.println("id:"+atts.getValue("id"));
		System.out.println("============================");
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("XMLContentHandler.endElement()");
		
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}

}
