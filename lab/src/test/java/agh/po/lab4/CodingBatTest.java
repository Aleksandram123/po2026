package agh.po.lab4;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CodingBatTest {

    @Test
    public void mapAB_obaKlucze() {
        Map<String, String> wejscie = new HashMap<>();
        wejscie.put("a", "Hi");
        wejscie.put("b", "There");

        Map<String, String> oczekiwane = new HashMap<>();
        oczekiwane.put("a", "Hi");
        oczekiwane.put("b", "There");
        oczekiwane.put("ab", "HiThere");

        assertEquals(oczekiwane, CodingBat.mapAB(wejscie));
    }

    @Test
    public void mapAB_tylkoA() {
        Map<String, String> wejscie = new HashMap<>();
        wejscie.put("a", "Hi");

        Map<String, String> oczekiwane = new HashMap<>();
        oczekiwane.put("a", "Hi");

        assertEquals(oczekiwane, CodingBat.mapAB(wejscie));
    }

    @Test
    public void mapAB_tylkoB() {
        Map<String, String> wejscie = new HashMap<>();
        wejscie.put("b", "There");

        Map<String, String> oczekiwane = new HashMap<>();
        oczekiwane.put("b", "There");

        assertEquals(oczekiwane, CodingBat.mapAB(wejscie));
    }

    @Test
    public void wordLen_powtorzenia() {
        Map<String, Integer> oczekiwane = new HashMap<>();
        oczekiwane.put("a", 1);
        oczekiwane.put("bb", 2);

        assertEquals(oczekiwane, CodingBat.wordLen(new String[]{"a", "bb", "a", "bb"}));
    }

    @Test
    public void wordLen_cztery_slowa() {
        Map<String, Integer> oczekiwane = new HashMap<>();
        oczekiwane.put("this", 4);
        oczekiwane.put("and", 3);
        oczekiwane.put("that", 4);

        assertEquals(oczekiwane, CodingBat.wordLen(new String[]{"this", "and", "that", "and"}));
    }

    @Test
    public void wordLen_codeBug() {
        Map<String, Integer> oczekiwane = new HashMap<>();
        oczekiwane.put("code", 4);
        oczekiwane.put("bug", 3);

        assertEquals(oczekiwane, CodingBat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}