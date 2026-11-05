package agh.po.lab3;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb=new CodingBat();

    @org.junit.Test
    public void monkeyTrouble() {
        assertEquals(true, cb.monkeyTrouble(true, true));
        assertEquals(true, cb.monkeyTrouble(false, false));
        assertEquals(false, cb.monkeyTrouble(true, false));
    }

    @org.junit.Test
    public void sumDouble() {
        assertEquals(3, cb.sumDouble(1, 2));
        assertEquals(5, cb.sumDouble(3, 2));
        assertEquals(8, cb.sumDouble(2, 2));
    }

    @org.junit.Test
    public void twoChar() {
        assertEquals("ja",cb.twoChar("java", 0));
        assertEquals("va",cb.twoChar("java", 2));
        assertEquals("ja",cb.twoChar("java", 3));

    }

    @org.junit.Test
    public void frontPiece() {
        assertEquals(new int[]{1,2}, cb.frontPiece(new int[]{1, 2, 3}));
        assertEquals(new int[]{1,2}, cb.frontPiece(new int[]{1, 2}));
        assertEquals(new int[]{1}, cb.frontPiece(new int[]{1}));
    }

    @org.junit.Test
    public void mapAB() {
        //Oba klucze obecne
        java.util.Map<String, String> map1 = new java.util.HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        java.util.Map<String, String> expected1 = new java.util.HashMap<>();
        expected1.put("a", "Hi");
        expected1.put("b", "There");
        expected1.put("ab", "HiThere");

        assertEquals(expected1, cb.mapAB(map1));

        //Obecny tylko klucz "a"
        java.util.Map<String, String> map2 = new java.util.HashMap<>();
        map2.put("a", "Hi");

        java.util.Map<String, String> expected2 = new java.util.HashMap<>();
        expected2.put("a", "Hi");

        assertEquals(expected2, cb.mapAB(map2));

        //Obecny tylko klucz "b"
        java.util.Map<String, String> map3 = new java.util.HashMap<>();
        map3.put("b", "There");

        java.util.Map<String, String> expected3 = new java.util.HashMap<>();
        expected3.put("b", "There");

        assertEquals(expected3, cb.mapAB(map3));
    }
    @org.junit.Test
    public void wordLen() {
        // Przypadek 1
        java.util.Map<String, Integer> expected1 = new java.util.HashMap<>();
        expected1.put("a", 1);
        expected1.put("bb", 2);
        assertEquals(expected1, cb.wordLen(new String[]{"a", "bb", "a", "bb"}));

        // Przypadek 2
        java.util.Map<String, Integer> expected2 = new java.util.HashMap<>();
        expected2.put("that", 4);
        expected2.put("and", 3);
        expected2.put("this", 4);
        assertEquals(expected2, cb.wordLen(new String[]{"this", "and", "that", "and"}));

        // Przypadek 3
        java.util.Map<String, Integer> expected3 = new java.util.HashMap<>();
        expected3.put("code", 4);
        expected3.put("bug", 3);
        assertEquals(expected3, cb.wordLen(new String[]{"code", "code", "code", "bug"}));
    }

}