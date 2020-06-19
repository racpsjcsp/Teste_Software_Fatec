package model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.*;

public class Aluguel {	

	//metodo
    public JSONObject inputAluguelDia(double valor, int dia) throws JSONException {
	 	
    	//Http request
    	String inline = "";
    	URL url;
    	HttpURLConnection conn; 
    	JSONObject obj = null;
    	
		try {
			
			url = new URL("https://aluguebug.herokuapp.com/calc?dados={\"valor_nominal\":"+"\""+valor+"\",\"dia\":"+"\""+dia+"\"}");
			conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect(); 
			Scanner sc = new Scanner(url.openStream());
	    	
	    	while(sc.hasNext()) {
	    		inline+=sc.nextLine();
	    	}
	    	
	    	//convertendo para JSON	    	
	    	obj = new JSONObject(inline.substring(inline.indexOf('{')).replace("\\", "")); 	
	    	
	    	sc.close();
	    	
		} catch (MalformedURLException e) {
			e.printStackTrace(); 
	    } catch (IOException e) {
			e.printStackTrace();
		}   	
    	
    	return obj;
    }
    
}