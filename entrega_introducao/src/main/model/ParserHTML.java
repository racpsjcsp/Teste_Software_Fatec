package model;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParserHTML {
    public ArrayList<String> parseFromWikiTitle() {
    	
    	//classe -- objeto
    	Document doc;
    	ArrayList<String> lista = new ArrayList<String>();
    	
		try {
			//site
			doc = Jsoup.connect("https://en.wikipedia.org/").get();
			
			//seleciona id 
	    	Elements newsHeadlines = doc.select("#mp-itn b a");
	    	
	    	//pega as tags "title" e guarda na lista 
	    	for (Element headline : newsHeadlines) {
	    		lista.add(headline.attr("title"));	    		
	    	}
	    	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return lista;
    }
    
    public ArrayList<String> parseFromWikiLink() {
    	
    	//classe -- objeto
    	Document doc;
    	ArrayList<String> lista = new ArrayList<String>();
    	
		try {
			//site
			doc = Jsoup.connect("https://en.wikipedia.org/").get();
			
			//seleciona id 
	    	Elements links = doc.select("#mp-portals li a");  //não sei o que colocar 
	    	
	    	//pega as tags "href" e guarda na lista
	    	for (Element link : links) {
	            lista.add(link.attr("href"));
	        }
	    	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return lista;
    }
}