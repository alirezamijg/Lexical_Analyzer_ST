package com.company;

public class Main {

    public static void main(String[] args) {
        Analyzer lexer = new Analyzer("C:/Input.txt");
        while (!lexer.isExausthed()) {
                System.out.printf("%-18s :  %s \n",lexer.currentLexema() , lexer.currentToken());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("END OF PROGRAM");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
