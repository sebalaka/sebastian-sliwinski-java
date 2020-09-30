package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            secondChallenge.probablyIWillThrowException(1.5,2.5);
            System.out.println("Program Working");
        } catch (Exception e) {
            System.out.println("Exception " + e);
        } finally {
            System.out.println("This will always execute");
        }
    }
}
