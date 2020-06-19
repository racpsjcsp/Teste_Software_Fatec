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
    	
//    	
//    	System.out.println("Rafael Augusto Campos Plinio");
//    	System.out.println("Consumindo API Web");
//    	
//    	//pegar valor do aluguel
//    	Scanner v = new Scanner(System.in);  // Create a Scanner object
//    	System.out.println("Digite o valor nominal:");
//    	String valor_nominal = v.nextLine();  // Read user input
//    	
//    	//pegar o dia
//    	Scanner d = new Scanner(System.in);  // Create a Scanner object
//    	System.out.println("Digite o dia do pagamento:");
//    	String dia = d.nextLine();  // Read user input
//    	
//    	//converte para double e int
//    	Double valor1 = Double.parseDouble(valor_nominal);
//    	int valor2 = Integer.parseInt(dia);    	 	
    	
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
	    	
	    	//System.out.println("\nJSON data in string format");
//	    	System.out.println(inline);
	    	
	    	//convertendo para JSON	    	
	    	obj = new JSONObject(inline.substring(inline.indexOf('{')).replace("\\", ""));
//	    	obj.put("valor_nominal", valor);
//	    	obj.put("dia", dia);
	    	
//	    	System.out.println(obj);
//	    	System.out.println("Objeto JSON:");
//	    	System.out.println(obj);
//	    	
//	    	System.out.println("Objeto JSON - inline");
//	    	System.out.println(inline);
//	    	System.out.println("print do valor...: "+valor);
//	    	System.out.println("print do dia...: "+dia);
	    	
	    	
//	    	url = new URL("https://aluguebug.herokuapp.com/calc?dados="+obj);
//			conn = (HttpURLConnection)url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.connect(); 
//			Scanner sc2 = new Scanner(url.openStream());
//	    	Double val1 = obj.getDouble(valor_nominal);
//	    	int val2 = obj.getInt(dia);
//	    	
//	    	url = new URL("https://aluguebug.herokuapp.com/calc?dados={\"valor_nominal\":"+"\""+val1+"\",\"dia\":"+"\""+val2+"\"}");
//	    	
//	    	conn = (HttpURLConnection)url.openConnection();
//	    	conn.setRequestMethod("POST");
//	    	conn.connect();
//	    	conn.setRequestProperty("Content-Type", "application/json; utf-8");
//	    	conn.setRequestProperty("Accept", "application/json");
//	    	conn.setDoOutput(true);
	    	//?????     	
	    	
	    	sc.close();
	    	//sc2.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   	
    	
    	return obj;
    }
    
//    public JSONObject aluguel_dia(double valor, int dia) {
//    	String inline2 = "";
//		return inline2;
//	}
}