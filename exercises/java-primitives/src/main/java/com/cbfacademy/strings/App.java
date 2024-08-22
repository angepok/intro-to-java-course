package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Write code that concatenates the input parameters and returns the 
         word1 = "Today";
         word2 = "is";
         word3 = "Tuesday";
         String dayOfTheWeek = word1 + word2 + word3;
         System.out.println(dayOfTheWeek);
         
        throw new RuntimeException("Not implemented");
    }

    public static Boolean areEqual(String word1, String word2) {
        // Write code to determine whether the input parameters are equal strings
        
         word1 = "Summer";
         word2 = "Winter";
         Boolean isEqual = areEqual(word1, word2);
         System.out.println(isEqual);
         
        throw new RuntimeException("Not implemented");
    }

    public static String format(String item, int quantity, double price) {
        // Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        item = "pencil";
        quantity = 4;
        price = 0.99;
        String itemD = "Item".concat(":").concat(" ").concat(item);
       // String itemDescription = "Item: /"item." Price: £/"price." Quantity: /"quantity".";

        throw new RuntimeException("Not implemented");
    }
}
