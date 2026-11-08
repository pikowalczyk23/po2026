package agh.po.lab3;

import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class CodingBatTest {
    @org.junit.Test
    public void doubleX(){
        CodingBat codingBat = new CodingBat();
        assertTrue(codingBat.doubleX("xxx"));
        assertTrue(codingBat.doubleX("aaaaxxbbb"));
        assertFalse(codingBat.doubleX("aaaaaxaaaxxa"));
    }

    @org.junit.Test
    public void lastDigit(){
        CodingBat testLastDigit = new CodingBat();
        assertTrue(testLastDigit.lastDigit(23434, 24));
        assertFalse(testLastDigit.lastDigit(165, 23));
        assertTrue(testLastDigit.lastDigit(0, 250));
    }

    @org.junit.Test
    public void lucky13(){
        CodingBat testLucky13 = new CodingBat();
        assertTrue(testLucky13.lucky13(new int[] {0, 2, 4}));
        assertFalse(testLucky13.lucky13(new int[] {1, 2, 4}));
        assertFalse(testLucky13.lucky13(new int[] {4, 4, 5, 3, 1, 2}));
    }

    @org.junit.Test
    public void endsLy(){
        CodingBat testEndsLy = new CodingBat();
        assertFalse(testEndsLy.endsLy("obama"));
        assertTrue(testEndsLy.endsLy("ly"));
        assertFalse(testEndsLy.endsLy("lylylylylylylylya"));
        assertFalse(testEndsLy.endsLy("l"));
    }
    @org.junit.Test
    public void mapAB2(){
        CodingBat testMapAB2 = new CodingBat();
        Map<String, String> mapaTestowa1 = new HashMap<>();
        mapaTestowa1.put("a", "aaa");
        mapaTestowa1.put("b", "aaa");
        mapaTestowa1.put("c", "ccc");

        assertFalse(testMapAB2.mapAB2(mapaTestowa1).containsKey("a"));
        assertFalse(testMapAB2.mapAB2(mapaTestowa1).containsKey("b"));
        assertTrue(testMapAB2.mapAB2(mapaTestowa1).containsKey("c"));


    }
}