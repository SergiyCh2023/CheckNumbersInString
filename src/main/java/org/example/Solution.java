package org.example;

public class Solution {

    public boolean checkingIfContainsOnlyNumbers(String s) {
        if (s.length() == 0) throw new NonSymbolsException();

        return s.matches("\\d+");


    }

}
