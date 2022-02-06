package domain;

import jdk.jshell.spi.ExecutionControl;

import java.util.TreeMap;

public class RomanNumerals {
    private final int MAX_LIMIT = 1999;
    private final int MIN_LIMIT = 0;

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public String convertToRoman(int arabicNumber) throws Exception {
        if(MAX_LIMIT < arabicNumber){
            throw new ExecutionControl.NotImplementedException("Désolé ce chiffre est trop élevé");
        }

        if(MIN_LIMIT == arabicNumber){
            return "0";
        }

        if(MIN_LIMIT > arabicNumber){
            throw new Exception("Merci de renseigner un chiffre valide");
        }

        int maxRomanNumberContained =  map.floorKey(arabicNumber);
        if ( arabicNumber == maxRomanNumberContained ) {
            return map.get(arabicNumber);
        }
        return map.get(maxRomanNumberContained) + this.convertToRoman(arabicNumber-maxRomanNumberContained);
    }

}
