package org.example;

public class NonSymbolsException extends IllegalArgumentException{

    NonSymbolsException(){
        super("It doesn't have symbols");
    }

}
