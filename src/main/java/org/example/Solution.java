package org.example;

public class Solution {

    public boolean checkingIfContainsOnlyNumbers(String s) {
        if (s.length() == 0) throw new NonSymbolsException();

        boolean result = true;
        if (!s.matches("\\d+")) return result = false;

        return  result;
    }

}
