package model;
import model.Aluguel;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteParametrizado {
	Aluguel alug = new Aluguel();
	
	//@Disabled
    @ParameterizedTest 
    @CsvSource(value = {											//dias
    		"690,0,621","690,1,621","690,2,621",					//0,1,2
    		"690,4,621","690,5,621","690,6,655.5",					//4,5,6
    		"690,9,654.5","690,10,655.5","690,11,690",				//9,10,11
    		"690,14,690","690,15,621","690,16,704.49",				//14,15,16
    		"690,29,713.46","690,30,714.15","690,31,-1",},			//29,30,31
    		delimiter = ',')
    public void testCsvSourceRACP(Double valor, int dia, Double result) throws JSONException {
		JSONObject obj = alug.inputAluguelDia(valor,dia);		
        assertEquals(result, obj.getDouble("valor_calculado"), 0.01);           
    }
        
    @ParameterizedTest(name = "Teste {index} => valor={0} dia={1}," + " resultado={2}")
    @CsvFileSource(resources = "/arquivoCSV_1.csv", delimiter = ',')
	public void testCsvFileSourceRACP(Double valor, int dia, Double result) throws JSONException {
    	JSONObject obj = alug.inputAluguelDia(valor,dia);		
        assertEquals(result, obj.getDouble("valor_calculado"), 0.01);       
	}
}

