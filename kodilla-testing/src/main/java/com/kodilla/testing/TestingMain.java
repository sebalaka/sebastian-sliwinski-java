package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator();
        int sum = calc.add(4,2);
        int sub = calc2.substract(4,2);

        if (sum == 6){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (sub == 2){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}