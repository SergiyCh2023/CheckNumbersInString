package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void checkingIfContainsOnlyNumbersTest() {
        boolean testResult = solution.checkingIfContainsOnlyNumbers("231546564@");
        Assertions.assertFalse(testResult);
    }


    @Test
    void checkingIfContainsOnlyNumbersTest2() {
        boolean testResult = solution.checkingIfContainsOnlyNumbers("231546564");
        Assertions.assertTrue(testResult);
    }

    @Test
    void checkingIfContainsOnlyNumbersTest3() {
        boolean testResult = solution.checkingIfContainsOnlyNumbers("2311`````5;4!65#6$4");
        Assertions.assertFalse(testResult);
    }

    @Test
    void checkingIfContainsOnlyNumbersTest4() {
        boolean testResult = solution.checkingIfContainsOnlyNumbers("1");
        Assertions.assertTrue(testResult);
    }

    @Test
    void checkingIfContainsOnlyNumbersTest5() {
        boolean testResult = solution.checkingIfContainsOnlyNumbers("1a");
        Assertions.assertFalse(testResult);
    }

    @Test
    void checkingIfContainsOnlyNumbersNonSymbolsExceptionTest() {
        Assertions.assertThrows(NonSymbolsException.class, ()->solution.checkingIfContainsOnlyNumbers(""));
    }



}