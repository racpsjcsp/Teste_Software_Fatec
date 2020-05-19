package model;

// public class Calculadora {
// 	public int somar(int x, int y) {
// 		return (x+y);
// 	}
// }




import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Calculadora {
    public ArrayList<String> parseFromWiki() {
    	
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
}