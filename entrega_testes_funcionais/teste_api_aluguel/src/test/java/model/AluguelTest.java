//This Java source file was generated by the Gradle 'init' task.

package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class AluguelTest {
	Double valor = 690.00;
	int dia;

    @Test public void testNominalRACP1() throws JSONException {
        Aluguel alug = new Aluguel();
        
        dia = 2; //0,1,2 

        if (dia == 1 || dia == 2) {
        	Double testNominalRACP1 = valor-(valor*0.10); //dia 1 ao 5 -> -10%  621.00
         	JSONObject result = alug.inputAluguelDia(valor,dia);
         	System.out.println(result);
            assertEquals(testNominalRACP1, result.getDouble("valor_calculado"), 0.01);
        } else if (dia < 0) {
        	int testNominalRACP1 = -1; //dia < 0	    	
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP1, result.getDouble("valor_calculado"), 0.01);
        }
    }
       
    @Test public void testNominalRACP2() throws JSONException {
        Aluguel alug = new Aluguel();
        
        dia = 6; //4,5,6

        if (dia == 4 || dia == 5) {      	
        	Double testNominalRACP2 = valor-(valor*0.10); //dia 9 -> -5,14% aprox
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP2, result.getDouble("valor_calculado"),0.01);
	    } else if (dia == 6) {
	    	Double testNominalRACP2 = valor-(valor*0.05); //dia 6 ao 10 -> -5%
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP2, result.getDouble("valor_calculado"),0.01);
	    }
    }
    
    @Test public void testNominalRACP3() throws JSONException {
        Aluguel alug = new Aluguel();
        
        dia = 11; //9,10,11

        if (dia == 9) {      	
        	Double testNominalRACP3 = valor-35.5; //dia 15  -> -10%
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP3, result.getDouble("valor_calculado"),0.01);
	    } else if (dia == 11 || dia == 10) {
	    	Double testNominalRACP3 = valor; //dia 11 ao 14 -> 0%
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP3, result.getDouble("valor_calculado"),0.01);
	    }
    }
    
    @Test public void testNominalRACP4() throws JSONException {
        Aluguel alug = new Aluguel();
        
        dia = 16; //16,17,18...29,30,31

        if (dia == 16) {      	
        	Double testNominalRACP4 = valor+(valor*0.021); //dia 16 -> +2,1%
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP4, result.getDouble("valor_calculado"),0.01);
	     } else if (dia == 15) {
	     	Double testNominalRACP4 = valor+(valor*0.10); //dia 15
	     	JSONObject result = alug.inputAluguelDia(valor,dia);
	     	System.out.println(result);
	        assertEquals(testNominalRACP4, result.getDouble("valor_calculado"),0.01);
	     } else if (dia == 14) {
	     	Double testNominalRACP4 = valor; //dia 14 0%
	     	JSONObject result = alug.inputAluguelDia(valor,dia);
	     	System.out.println(result);
	        assertEquals(testNominalRACP4, result.getDouble("valor_calculado"),0.01);
	     } else if (dia == 29) {
	     	Double testNominalRACP4 = valor+(valor*0.034); //dia 29 -> +3,4%
	     	JSONObject result = alug.inputAluguelDia(valor,dia);
	     	System.out.println(result);
	        assertEquals(testNominalRACP4, result.getDouble("valor_calculado"),0.01);
	    } else if (dia == 30) {
	    	Double testNominalRACP4 = valor+(valor*0.035); //dia 30 -> +3,5%
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP4, result.getDouble("valor_calculado"),0.01);
	    } else if (dia >= 31) {	    	
	    	int testNominalRACP4 = -1; //dia >= 31	    	
	    	JSONObject result = alug.inputAluguelDia(valor,dia);
	    	System.out.println(result);
	        assertEquals(testNominalRACP4, result.getDouble("valor_calculado"),0.01);
	    }
    }    
}