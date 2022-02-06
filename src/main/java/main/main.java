package main;

import domain.RomanNumerals;
import jdk.jshell.spi.ExecutionControl;

public class main {
    public static void main(String[] args){
        RomanNumerals romanNumerals = new RomanNumerals();
        try{
            System.out.println(romanNumerals.convertToRoman(1999));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
