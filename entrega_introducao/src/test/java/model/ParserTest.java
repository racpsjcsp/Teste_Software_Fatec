/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.ParserHTML;

import java.util.ArrayList;

public class ParserTest {
    @Test public void testParse() {
        ParserHTML classUnderTest = new ParserHTML();
        
        ArrayList<String> compara = new ArrayList<String>();
        
        //headlines atuais
        compara.add("COVID-19 pandemic");
        compara.add("White stork");
        compara.add("Iranian support vessel Konarak");
        compara.add("Visakhapatnam gas leak");
        compara.add("Deaths in 2020");
        compara.add("Portal:Current events");
        compara.add("Deaths in 2020");
        compara.add("Wikipedia:In the news/Candidates");
        
        //console - exibe headline atual
        System.out.println(classUnderTest.parseFromWiki());
        
        ArrayList<String> results =classUnderTest.parseFromWiki();
        assertEquals(compara.get(0), results.get(0));
    }
}