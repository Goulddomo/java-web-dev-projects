package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void nonBracketCharReturnsTrue() {
        String testCase = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertEquals(true, result);
    }

    @Test
    public void stringsReturnsTrue() {
        String testCase = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertEquals(true, result);
    }

    @Test
    public void stringsReturnsTrue2() {
        String testCase = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertTrue(result);
    }

    @Test
    public void stringsReturnsTrue3() {
        String testCase = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertTrue(result);
    }

    @Test
    public void stringsReturnsFalse() {
        String testCase = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertFalse(result);
    }

    @Test
    public void stringsReturnsFalse2() {
        String testCase = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertFalse(result);
    }

    @Test
    public void stringsReturnsFalse3() {
        String testCase = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertFalse(result);
    }

    @Test
    public void stringsReturnsFalse4() {
        String testCase = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);
//        assertTrue(BalancedBrackets.hasBalancedBrackets(testCase));
        assertFalse(result);
    }



}