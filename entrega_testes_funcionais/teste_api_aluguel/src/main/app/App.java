package app;

import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

import model.Aluguel;

public class App {
	public static void main(String [] args) throws JSONException {		
		System.out.println("Rafael Augusto Campos Plinio");
    	System.out.println("Consumindo API Web");    
    	
    	//pegar valor do aluguel
    	Scanner v = new Scanner(System.in);  // Create a Scanner object
    	System.out.println("Digite o valor nominal:");
    	String valor_nominal = v.nextLine();  // Read user input
    	
    	//pegar o dia
    	Scanner d = new Scanner(System.in);  // Create a Scanner object
    	System.out.println("Digite o dia do pagamento:");
    	String dia = d.nextLine();  // Read user input
    	
    	//converte para double e int
    	double valor = Double.parseDouble(valor_nominal);
    	int dia2 = Integer.parseInt(dia);
    	
    	Aluguel alug = new Aluguel();

    	JSONObject result1 = alug.inputAluguelDia(valor,dia2);
    	System.out.println(result1);
    	
    	v.close();
    	d.close();
     
	}
}