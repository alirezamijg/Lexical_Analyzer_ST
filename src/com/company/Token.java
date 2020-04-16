package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {

    TOKEN_LEG ("<="),
    TOKEN_EQ ("=="),
    TOKEN_NOT("!="),
    TOKEN_PA("+="),
    TOKEN_MA("-="),
    TOKEN_DA("/="),
    TOKEN_GEQ (">="),
    TOKEN_MUA("\\*="),
    TOKEN_LESS ("<"),
    TOKEN_GT (">"),
    TOKEN_MINUS ("-"),
    TOKEN_PLUS ("\\+"),
    TOKEN_MUL ("\\*"),
    TOKEN_DIV ("/"),
    TOKEN_AND ("&"),
    TOKEN_OR ("\\|"),
    TOKEN_EXPONENTIATIN("_"),
    TOKEN_Exclamationmark("!"),
    TOKEN_ASSIGN ("="),
    TOKEN_OPEN_PARENTHESES ("\\("),
    TOKEN_CLOSE_PARENTHESES ("\\)"),
    TOKEN_COLON(":"),
    TOKEN_SEMI (";"),
    TOKEN_COMMA (","),
    TOKEN_EXPONENTIATION("\\^"),
    TOKEN_KEY_DEFINE ("define"),
    TOKEN_REMAINDER("%"),
    TOKEN_KEY_AS ("as"),
    TOKEN_KEY_INT("int"),
    TOKEN_KEY_VOID("void"),
    TOKEN_KEY_WHILE("while"),
    TOKEN_KEY_RETURN("return"),
    TOKEN_KEY_READ("read"),
    TOKEN_KEY_WRITE("write"),
    TOKEN_KEY_PRINT("print"),
    TOKEN_KEY_CONTINUE("continue"),
    TOKEN_KEY_BREAK("break"),
    TOKEN_KEY_BOOL("bool"),
    TOKEN_KEY_DOUBLE("double"),
    TOKEN_KEY_IS ("is"),
    TOKEN_KEY_IF ("if"),
    TOKEN_KEY_THEN ("then"),
    TOKEN_KEY_ELSE ("else"),
    TOKEN_KEY_ENDIF ("endif"),
    TOKEN_OPEN_SQUREBRAKET("\\["),
    TOKEN_CLOSE_SQUREBRAKET("\\]"),
    TOKEN_OPEN_BRACKET ("\\{"),
    TOKEN_CLOSE_BRACKET ("\\}"),
    TOKEN_DIFFERENT ("<>"),

    TOKEN_letter ("\"[^\"]+\""),
    digit ("\\d"),
    IDENTIFIER ("\\w+");

    private final Pattern pattern;

    Token(String regex) {

        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }
        return -1;
    }
}