package com.cbfacademy;

import java.beans.IndexedPropertyDescriptor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
           for(int i = 0; i < numbers.size(); i++){
               if (numbers.size() % 3 == 0) {
                System.out.print("Fizz");
               }
               if (numbers.size()% 5 == 0) {
                System.out.print("Buzz"); 
               }
               if ((numbers.size() % 3 ==0 )&& (numbers.size() % 5 == 0)) 
               {
                System.out.print("FizzBuzz");
               }
            }
        return fizzBuzz(numbers);
      
    }

    public String whichMonth(Integer number) {
        // Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        
        // Method 1
        // Integer is a wrapped Integr meaning number is a collection
        // parameter number is an arraylist/linkedlist
        //Method Linkedlist
        LinkedList<String> MonthList = new LinkedList<>();
            MonthList.add(1, "January");
            MonthList.add(2, "February");
            MonthList.add(3, "March");
            MonthList.add(4, "April");
            MonthList.add(5, "May");
            MonthList.add(6, "June");
            MonthList.add(7, "July");
            MonthList.add(8, "August");
            MonthList.add(9, "September");
            MonthList.add(10, "October");
            MonthList.add(11, "November");
            MonthList.add(12, "December");
            for (int i = 0; i < MonthList.size(); i++) {
                if(number == i){
                    System.out.println(MonthList.get(i));
                } else {
                    System.out.println("Invalid month number");
                }
            }

        // use hashmap according to key and value logic, month number and month
        //using an array
        String[] monthArray = ["January", "February", "March", "April", "May", "June", "July","August", "September", 
        "October", "November", "December"];


        //  Method2
            switch (number) {
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6 :
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                case 12:
                    System.out.print("December");
                    break;
                default:
                    System.out.print("Invalid month number");
                    break;
            }

        // Method 3, using loop
         //list of numbers
         //loop through numbers
         // when loop is at particular number
         //prnt out month that represent the number
         //apply logic above without inputting numbers
             number = 12;
            for (int i = 0; i < number; i++) {
                if (i == 1) {
                    System.out.print("January");
                } 
                if (i == 2) {
                    System.out.print("February");
                } 
                if (i == 3) {
                    System.out.print("March");
                } 
                if (i == 4) {
                    System.out.print("April");
                } 
                if (i == 5) {
                    System.out.print("May");
                } 
                if (i == 6) {
                    System.out.print("June");
                } 
                if (i == 7) {
                    System.out.print("July");
                } 
                if (i == 8) {
                    System.out.print("August");
                } 
                if (i == 9) {
                    System.out.print("September");
                } 
                if (i == 10) {
                    System.out.print("October");
                } 
                if (i == 11) {
                    System.out.print("November");
                } 
                if (i == 12) {
                    System.out.print("December");
                } 
                else {
                    System.out.print("Invalid month number");
                }
            }
                


    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //  Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // creating hashmap with sixe of 100
        Map<String, Integer> sum = new Map<String,Integer>(100);
        
        // sum of all even numbers
         for (int i = 0; i < sum.size(); i= i+2) {
            int sumOfEven = 0;
            sumOfEven = sumOfEven + sum;
            System.out.println(sumOfEven);
         }
        // sum of all odd numbers
         for (int i = 0; i < sum.size(); i= i+2) {
            int sumOfOdds = 0;
            sumOfOdds = sumOfOdds + sum;
            System.out.println(sumOfOdds);
         }

        // returning map with entries
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        //  Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        
        // loop through entries in arraylist
        for (Integer integer : numbers) {
            // printing out numbers in reverse
            numbers = (numbers / 10) % 10;
            System.out.print(numbers);
        }
        ;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
