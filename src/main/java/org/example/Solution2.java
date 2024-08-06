package org.example;

public class Solution2 {

    public boolean checkingIfContainsOnlyNumbers(String s) {
        if (s.length() == 0) throw new NonSymbolsException();
        return s.chars().allMatch(e -> Character.isDigit(e));
    }


}
