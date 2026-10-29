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
}